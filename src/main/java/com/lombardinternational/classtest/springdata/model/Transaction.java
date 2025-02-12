package com.lombardinternational.classtest.springdata.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Transaction extends Evaluable {

    private String externalId;

    private List<PaymentInstruction> paymentInstructions;

}
