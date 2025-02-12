package com.lombardinternational.classtest.springdata.computation;

import com.lombardinternational.classtest.springdata.model.Evaluable;
import com.lombardinternational.classtest.springdata.model.RiskEvaluation;
import com.lombardinternational.classtest.springdata.service.EvaluableRepositoryService;
import com.lombardinternational.classtest.springdata.service.PolicyRepositoryService;
import com.lombardinternational.classtest.springdata.service.TransactionRepositoryService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RiskEvaluationService {

    private final TransactionRepositoryService transactionRepositoryService;

    private final PolicyRepositoryService policyRepositoryService;

    private final PaymentInstructionComputationService paymentInstructionComputationService;

    @PostConstruct
    public void init() {
        this.computeAll();
    }

    public void computeAll() {
        computeAllTransaction();

        computeAllPolicy();

    }

    public void computeAllPolicy() {
        System.out.println("Compute all policies");

        computeAll(policyRepositoryService, paymentInstructionComputationService);
    }

    public void computeAllTransaction() {
        System.out.println("Compute all transactions");

        computeAll(transactionRepositoryService, paymentInstructionComputationService);
    }

    private void computeAll(EvaluableRepositoryService repositoryService, AbstractComputationService computationService) {

        List<Evaluable> evaluables = repositoryService.findAll();

        evaluables.forEach(evaluable -> {

            RiskEvaluation riskEvaluation;
            try {
                riskEvaluation = computationService.compute(evaluable);
            } catch (Exception e) {
                riskEvaluation = new RiskEvaluation("ERROR",  this.truncateString("Computation Error : " + e.getMessage(),255,"..."));
            }
            if (riskEvaluation != null) {
                evaluable.setRisk(riskEvaluation.getRisk());
                evaluable.setRiskDescription(riskEvaluation.getDescription());
            } else {
                evaluable.setRisk(null);
                evaluable.setRiskDescription(null);
            }
            repositoryService.save(evaluable);
        });
    }

    private static String truncateString(String string, int maxLength, String replacement) {

        if (replacement == null || replacement.length() > maxLength) {
            replacement = "";
        }
        if (string == null || maxLength < 1 || string.length() <= maxLength) {
            return string;
        }
        return string.substring(0, maxLength - replacement.length()) + replacement;
    }



}
