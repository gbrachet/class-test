package com.lombardinternational.classtest.springdata.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "POLICY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @OneToMany(mappedBy = "policy", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<TransactionEntity> transactionList;

    private String risk;
    private String riskDescription;

}
