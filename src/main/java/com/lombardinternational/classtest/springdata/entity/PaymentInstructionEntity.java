package com.lombardinternational.classtest.springdata.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENT_INSTRUCTION")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInstructionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String externalId;

    private String paymentMode;

    @ManyToOne
    @JoinColumn(name = "TRANSACTION_ID", referencedColumnName = "ID")
    private TransactionEntity transaction;
}
