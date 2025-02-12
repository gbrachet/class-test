package com.lombardinternational.classtest.computation;

import com.lombardinternational.classtest.springdata.computation.RiskEvaluationService;
import com.lombardinternational.classtest.springdata.service.PolicyRepositoryService;
import com.lombardinternational.classtest.springdata.service.TransactionRepositoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_CLASS)
public class PaymentInstructionComputationServiceTest {

    @Autowired
    private RiskEvaluationService riskEvaluationService;
    @Autowired
    private PolicyRepositoryService policyRepositoryService;
    @Autowired
    private TransactionRepositoryService transactionRepositoryService;


    @Test
    public void testPolicyRisk() {
        riskEvaluationService.computeAllPolicy();
        assertThat(policyRepositoryService.findAll().stream().sorted((p1,p2) -> p1.getId().compareTo(p2.getId())))
                .hasSize(17).extracting("risk")
                .containsExactly("MISSING_DATA",
                        "MISSING_DATA",
                        "TRUE",
                        "TRUE",
                        "TRUE",
                        "FALSE",
                        "FALSE",
                        "TRUE",
                        "TRUE",
                        "TRUE",
                        "TRUE",
                        "MISSING_DATA",
                        "MISSING_DATA",
                        "TRUE",
                        "TRUE",
                        "MISSING_DATA",
                        "MISSING_DATA");

    }

    @Test
    public void testTransactionRisk() {
        riskEvaluationService.computeAllTransaction();
        assertThat(transactionRepositoryService.findAll().stream().sorted((p1,p2) -> p1.getId().compareTo(p2.getId())))
                .hasSize(24).extracting("risk")
                .containsExactly("MISSING_DATA",
                "MISSING_DATA",
                "TRUE",
                "TRUE",
                "TRUE",
                "FALSE",
                "FALSE",
                "TRUE",
                "TRUE",
                "TRUE",
                "TRUE",
                "MISSING_DATA",
                "MISSING_DATA",
                "FALSE",
                "TRUE",
                "FALSE",
                "TRUE",
                "TRUE",
                "FALSE",
                "TRUE",
                "MISSING_DATA",
                "FALSE",
                "TRUE",
                "MISSING_DATA"
                );
    }

}
