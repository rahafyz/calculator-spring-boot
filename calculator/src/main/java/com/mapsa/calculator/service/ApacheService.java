package com.mapsa.calculator.service;

import com.mapsa.calculator.model.Operation;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.rank.Median;
import org.apache.commons.math3.util.FastMath;
import org.springframework.stereotype.Service;

@Service
public class ApacheService implements Icalculator{
    @Override
    public int sum(Operation model) {
        return (int) StatUtils.sum(model.getNums());
    }

    @Override
    public int subtract(Operation model) {
        return FastMath.addExact(model.getNum1(),model.getNum2()*(-1));
    }

    @Override
    public int multiply(Operation model) {
        return FastMath.multiplyExact(model.getNum1(),model.getNum2());
    }

    @Override
    public double divide(Operation model) {
        if(model.getNum1() == 0) return 0;
        if(model.getNum2() == 0) return 0;
        return model.getNum1()/model.getNum2();
    }

    @Override
    public double sqrt(Operation model) {
        return FastMath.sqrt(model.getNum1());
    }

    @Override
    public int power(Operation model) {
        return (int) FastMath.pow(model.getNum1(), model.getNum2());
    }

    @Override
    public double avarage(Operation model) {
        return StatUtils.mean(model.getNums());
    }

    @Override
    public double median(Operation model) {
        Median median = new Median();
        return median.evaluate(model.getNums());
    }
}
