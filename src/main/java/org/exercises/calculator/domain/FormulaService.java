package org.exercises.calculator.domain;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FormulaService {

    public int timeElapsed = 0;
    public static final int INCREMENT_5 = 5;
    private Calculator calculator;

    public FormulaService(){

    }
    public FormulaService(Calculator calculator){
        this.calculator = calculator;
    }

    public void addTheTimeElapsed() {
        this.timeElapsed = calculator.add(BigDecimal.valueOf(this.timeElapsed), BigDecimal.valueOf(INCREMENT_5)).intValue();
    }

    public int secondsPassed(){
        // implement
        return 0;
    }

    public int numberOfRuns(){
        // implement
        return 0;

    }

    public void skipAhead(int skipCount){
        // implement
    }

}
