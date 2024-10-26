package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServiceInterface calculatorService;

    public CalculatorController(CalculatorServiceInterface calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping(path = "/calculator")
    public String welcome(){
        return calculatorService.welcome();
    }

    @GetMapping (path = "/calculator/plus")
    public String plus(@RequestParam("num1") int parNum1, @RequestParam("num2") int parNum2){
        int plusPar = parNum1 + parNum2;
        return calculatorService.plus(parNum1, parNum2);
    }

    @GetMapping (path = "/calculator/minus")
    public String minus(@RequestParam("num1") int parNum1, @RequestParam("num2") int parNum2) {
        return calculatorService.minus(parNum1, parNum2);
    }

    @GetMapping (path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int parNum1, @RequestParam("num2") int parNum2) {
        return calculatorService.multiply(parNum1, parNum2);
    }

    @GetMapping (path = "/calculator/divide")
    public String divide(@RequestParam("num1") int parNum1, @RequestParam("num2") int parNum2) {
       return calculatorService.divide(parNum1, parNum2);
    }

    }
