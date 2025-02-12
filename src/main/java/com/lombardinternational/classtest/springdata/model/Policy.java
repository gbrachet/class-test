package com.lombardinternational.classtest.springdata.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Policy extends Evaluable {

    private String number;

    private List<Transaction> transactionList;
}
