package com.mapsa.calculator.controller;

import com.mapsa.calculator.model.Operation;
import com.mapsa.calculator.service.Icalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalculatorController {
    Operation operation = new Operation();
    private Icalculator calculator;

    @Autowired

    public CalculatorController(@Qualifier("apacheService") Icalculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping(value = "/sum")
    public int sum(@RequestParam(name = "array of numbers:",required = true) double[] nums){
        operation.setNums(nums);
        return calculator.sum(operation);
    }

    @GetMapping(value = "/substrate")
    public int sub(@RequestParam(name = "num1", required = true) Integer num1,
                   @RequestParam(name = "num2", required = true) Integer num2){
        operation.setNum1(num1);
        operation.setNum2(num2);
        return calculator.subtract(operation);
    }

    @GetMapping(value = "/multiply")
    public int multi(@RequestParam(name = "num1", required = true) Integer num1,
                     @RequestParam(name = "num2", required = true) Integer num2){
        operation.setNum1(num1);
        operation.setNum2(num2);
        return calculator.multiply(operation);
    }

    @GetMapping(value = "/divide")
    public double div(@RequestParam(name = "num1", required = true) Integer num1,
                   @RequestParam(name = "num2", required = true) Integer num2){
        operation.setNum1(num1);
        operation.setNum2(num2);
        return calculator.divide(operation);
    }
    @GetMapping(value = "/sqrt")
    public double sqrt(@RequestParam(name = "num1", required = true) Integer num1){
        operation.setNum1(num1);
        return calculator.sqrt(operation);
    }
    @GetMapping(value = "/power")
    public int pow(@RequestParam(name = "num1", required = true) Integer num1,
                   @RequestParam(name = "num2", required = true) Integer num2){
        operation.setNum1(num1);
        operation.setNum2(num2);
        return calculator.power(operation);
    }

    @GetMapping(value = "/avarage")
    public int mean(@RequestParam(name = "array of numbers:",required = true) double[] nums){
        operation.setNums(nums);
        return (int) calculator.avarage(operation);
    }

    @GetMapping(value = "/median")
    public int median(@RequestParam(name = "array of numbers:",required = true) double[] nums){
        operation.setNums(nums);
        return (int) calculator.median(operation);
    }


}
