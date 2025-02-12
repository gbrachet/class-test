package com.lombardinternational.classtest.springdata.service;


import com.lombardinternational.classtest.springdata.entity.TransactionEntity;
import com.lombardinternational.classtest.springdata.mapper.TransactionMapper;
import com.lombardinternational.classtest.springdata.model.Transaction;
import com.lombardinternational.classtest.springdata.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TransactionRepositoryService extends EvaluableRepositoryService<Transaction> {

    private final TransactionRepository repository;
    private final TransactionMapper mapper;


    public List<Transaction> findAll() {
        return repository.findAll().stream().map(mapper::mapToDomain).collect(Collectors.toList());
    }

    public void save(Transaction transaction) {
        TransactionEntity entity = mapper.mapToEntity(transaction);
        entity.setPolicy(repository.findById(entity.getId()).get().getPolicy());
        repository.save(entity);
    }
}
