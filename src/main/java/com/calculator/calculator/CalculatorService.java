package com.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface{
    public String welcome(){
        return "Добро пожаловать в калькулятор!";
    }

    public String plus( int parNum1, int parNum2){
        int plusPar = parNum1 + parNum2;
        return parNum1 + " + " + parNum2 + " = " + plusPar;
    }

    public String minus(int parNum1, int parNum2) {
        int minusPar = parNum1 - parNum2;
        return parNum1 + " - " + parNum2 + " = " + minusPar;
    }


    public String multiply(int parNum1, int parNum2) {
        int multiplyPar = parNum1 * parNum2;
        return parNum1 + " * " + parNum2 + " = " + multiplyPar;
    }

    public String divide(int parNum1, int parNum2) {
        double dividePar = (double) parNum1 / (double) parNum2;
        if (parNum2 == 0) {
            return "На ноль делить дельзя";
        } else return parNum1 + " / " + parNum2 + " = " + dividePar;}


}
