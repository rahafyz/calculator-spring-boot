package com.mapsa.calculator.service;

import com.mapsa.calculator.model.Operation;

public interface Icalculator {

    public int sum(Operation model);

    public int subtract(Operation model);

    public int multiply(Operation model);

    public double divide(Operation model);


    public double sqrt(Operation model);

    public int power(Operation model);

    public double avarage(Operation model);

    public double median(Operation model);

}
