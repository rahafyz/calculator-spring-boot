package com.mapsa.calculator.controller;

import com.mapsa.calculator.model.Operation;
import com.mapsa.calculator.service.Icalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorControllerThymeleaf {
    Operation operation = new Operation();
    private Icalculator calculator;
    @Autowired

    public CalculatorControllerThymeleaf(@Qualifier("calculatorService") Icalculator calculator) {
        this.calculator = calculator;
    }
    @RequestMapping("/calculator")
    public String getCalculatorPage(Model model){
        model.addAttribute("operation", operation);
        return "calculator";
    }

    @RequestMapping(value="/calculator", params="sum", method = RequestMethod.POST)
    public String add(@ModelAttribute("operation") Operation operation, Model model ){
        model.addAttribute("result", calculator.sum(operation));
        return "calculator";
    }

    @RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("operation") Operation operation, Model model ){
        model.addAttribute("result", calculator.subtract(operation));
        return "calculator";
    }

    @RequestMapping(value="/calculator", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operation") Operation operation, Model model ){
        model.addAttribute("result", calculator.multiply(operation));
        return "calculator";
    }

    @RequestMapping(value="/calculator", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operation") Operation operation, Model model ){
        model.addAttribute("result", calculator.divide(operation));
        return "calculator";
    }


    @RequestMapping(value="/calculator", params="sqrt", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("operation") Operation operation, Model model ){
        model.addAttribute("result", calculator.sqrt(operation));
        return "calculator";
    }

    @RequestMapping(value="/calculator", params="power", method = RequestMethod.POST)
    public String power(@ModelAttribute("operation") Operation operation, Model model ){
        model.addAttribute("result", calculator.power(operation));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "mean" , method = RequestMethod.POST)
    public String avarage(@ModelAttribute("operation") Operation operation, Model model){
        model.addAttribute("result", calculator.avarage(operation));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "median" , method = RequestMethod.POST)
    public String median(@ModelAttribute("operation") Operation operation, Model model){
        model.addAttribute("result", calculator.median(operation));
        return "calculator";
    }

}
