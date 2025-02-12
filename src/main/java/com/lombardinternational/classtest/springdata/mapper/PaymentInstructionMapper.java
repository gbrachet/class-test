package com.lombardinternational.classtest.springdata.mapper;

import com.lombardinternational.classtest.springdata.entity.PaymentInstructionEntity;
import com.lombardinternational.classtest.springdata.model.PaymentInstruction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentInstructionMapper {

    PaymentInstruction mapToDomain(PaymentInstructionEntity entity);

    PaymentInstructionEntity mapToEntity(PaymentInstruction entity);
}
