package com.lombardinternational.classtest.springdata.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "TRANS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String externalId;

    @OneToMany(mappedBy = "transaction", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<PaymentInstructionEntity> paymentInstructions;

    private String risk;
    private String riskDescription;

    @ManyToOne
    @JoinColumn(name = "POLICY_ID", referencedColumnName = "ID")
    private PolicyEntity policy;

}
