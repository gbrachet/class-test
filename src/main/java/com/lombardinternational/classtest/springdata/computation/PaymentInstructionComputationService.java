package com.lombardinternational.classtest.springdata.computation;

import com.lombardinternational.classtest.springdata.model.Evaluable;
import com.lombardinternational.classtest.springdata.model.RiskEvaluation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentInstructionComputationService extends AbstractComputationService {

    public RiskEvaluation compute(Evaluable evaluable) {
        throw new IllegalArgumentException(evaluable.getId().toString());
        //TODO
//        return new RiskEvaluation();
    }
}
