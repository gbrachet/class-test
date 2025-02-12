package com.lombardinternational.classtest.springdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RiskEvaluation {

    private String risk;
    private String description;
}
