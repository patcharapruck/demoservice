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

        if(reaponse.getOperator().equals("+")){
            reaponse.setAns(calculator.getFirstnum()+calculator.getSecondnum());
        }
        else if(reaponse.getOperator().equals("-")){
            reaponse.setAns(calculator.getFirstnum()-calculator.getSecondnum());
        }
        else if(reaponse.getOperator().equals("*")){
            reaponse.setAns(calculator.getFirstnum()-calculator.getSecondnum());
        }
        else if(reaponse.getOperator().equals("/")){
            reaponse.setAns(calculator.getFirstnum()-calculator.getSecondnum());
        }

        return reaponse;
    }
}
