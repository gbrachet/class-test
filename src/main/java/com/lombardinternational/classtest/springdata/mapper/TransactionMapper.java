package com.lombardinternational.classtest.springdata.mapper;

import com.lombardinternational.classtest.springdata.entity.TransactionEntity;
import com.lombardinternational.classtest.springdata.model.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PaymentInstructionMapper.class})
public interface TransactionMapper {

    Transaction mapToDomain(TransactionEntity entity);

    TransactionEntity mapToEntity(Transaction entity);
}
