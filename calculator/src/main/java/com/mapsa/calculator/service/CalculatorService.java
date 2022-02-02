package com.mapsa.calculator.service;


import com.mapsa.calculator.model.Operation;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.rank.Median;
import org.springframework.stereotype.Service;
import java.lang.Math;

@Service
public class CalculatorService implements Icalculator {


    @Override
    public int sum(Operation model) {
        return model.getNum1()+model.getNum2();
    }

    @Override
    public int subtract(Operation model) {
        return model.getNum1()-model.getNum2();
    }

    @Override
    public int multiply(Operation model) {
        return model.getNum1()*model.getNum2();
    }

    @Override
    public double divide(Operation model) {
        if(model.getNum1() == 0) return 0;
        if(model.getNum2() == 0) return 0;
        return model.getNum1()/model.getNum2();
    }

    @Override
    public double sqrt(Operation model) {
        return Math.sqrt(model.getNum3());
    }

    @Override
    public int power(Operation model) {
        return (int) Math.pow(model.getNum1(), model.getNum2());
    }

    @Override
    public double avarage(Operation model) {
        double[] numbers = {model.getArr1(),model.getArr2(), model.getArr3(), model.getArr4(), model.getArr5()};
        Mean mean = new Mean();
        return mean.evaluate(numbers);
    }

    @Override
    public double median(Operation model) {
        double[] numbers = {model.getArr1(),model.getArr2(), model.getArr3(), model.getArr4(), model.getArr5()};
        Median median = new Median();
        return median.evaluate(numbers);
    }
}
