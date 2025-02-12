package com.lombardinternational.classtest.springdata.computation;

import com.lombardinternational.classtest.springdata.model.Evaluable;
import com.lombardinternational.classtest.springdata.model.RiskEvaluation;

public abstract class AbstractComputationService {

    public abstract RiskEvaluation compute(Evaluable evaluable);
}
