package com.lombardinternational.classtest.springdata.mapper;

import com.lombardinternational.classtest.springdata.entity.PolicyEntity;
import com.lombardinternational.classtest.springdata.model.Policy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TransactionMapper.class})
public interface PolicyMapper {

    Policy mapToDomain(PolicyEntity entity);

    PolicyEntity mapToEntity(Policy entity);
}
