package com.example.demoservice.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/hellocal/{operator}")
    public Calculator helloOperator(@PathVariable String operator){
        Calculator calculator = new Calculator();
        calculator.setOperator(operator);
        return calculator;
    }

    @PostMapping("/hellocal")
    public Calculator hellocalculator(@RequestBody Calculator calculator){
        Calculator reaponse = new Calculator();

        if(calculator.getOperator().equals("+")){
            reaponse.setAns(calculator.getFirstnum()+calculator.getSecondnum());
        }
        else if(calculator.getOperator().equals("-")){
            reaponse.setAns(calculator.getFirstnum()-calculator.getSecondnum());
        }
        else if(calculator.getOperator().equals("*")){
            reaponse.setAns(calculator.getFirstnum()*calculator.getSecondnum());
        }
        else if(calculator.getOperator().equals("/")){
            reaponse.setAns(calculator.getFirstnum()/calculator.getSecondnum());
        }
        reaponse.setFirstnum(calculator.getFirstnum());
        reaponse.setSecondnum(calculator.getSecondnum());
        reaponse.setOperator(calculator.getOperator());

        return reaponse;
    }
}
