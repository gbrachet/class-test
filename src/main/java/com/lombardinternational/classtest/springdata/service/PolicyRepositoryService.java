package com.lombardinternational.classtest.springdata.service;


import com.lombardinternational.classtest.springdata.mapper.PolicyMapper;
import com.lombardinternational.classtest.springdata.model.Policy;
import com.lombardinternational.classtest.springdata.repository.PolicyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PolicyRepositoryService extends EvaluableRepositoryService<Policy> {

    private final PolicyRepository repository;
    private final PolicyMapper mapper;

    public PolicyRepositoryService(PolicyRepository repository, PolicyMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<Policy> findAll() {
        return repository.findAll().stream().map(mapper::mapToDomain).collect(Collectors.toList());
    }

    public void save(Policy policy) {
        repository.save(mapper.mapToEntity(policy));
    }

}
