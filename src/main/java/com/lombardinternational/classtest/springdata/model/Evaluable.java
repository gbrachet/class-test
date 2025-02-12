package com.lombardinternational.classtest.springdata.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public abstract class Evaluable {

    private Long id;
    private String risk;
    private String riskDescription;
}
