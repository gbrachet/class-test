package com.lombardinternational.classtest.springdata.model;

import lombok.Data;

@Data
public class PaymentInstruction {

    private Long id;

    private String externalId;

    private String paymentMode;

}
