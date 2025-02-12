package com.lombardinternational.classtest.springdata.service;

import com.lombardinternational.classtest.springdata.model.Evaluable;

import java.util.List;

public abstract class EvaluableRepositoryService<E extends Evaluable> {

    public abstract List<E> findAll();

    public abstract void save(E transaction);
}
