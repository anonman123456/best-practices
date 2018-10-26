package org.exercises.calculator.domain;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Calculator {

    private MathContext mc = new MathContext(4, RoundingMode.HALF_UP);

    public BigDecimal add(BigDecimal... numbers){
        BigDecimal result = new BigDecimal(0);
        for(BigDecimal number : numbers){
            result = result.add(number);
        }
        return result.setScale(4,RoundingMode.HALF_UP).stripTrailingZeros();
    }

    public BigDecimal multiply(BigDecimal... numbers){
        BigDecimal result = new BigDecimal(0);
        for(BigDecimal number : numbers){
            result = result.multiply(number);
        }
        return result.setScale(4,RoundingMode.HALF_UP).stripTrailingZeros();
    }

    public BigDecimal divide(BigDecimal... numbers){
        BigDecimal result = new BigDecimal(0);
        for(BigDecimal number : numbers){
            result = result.divide(number);
        }
        return result.setScale(4,RoundingMode.HALF_UP).stripTrailingZeros();
    }

    public BigDecimal sqrt(BigDecimal number){
        return number.sqrt(mc).stripTrailingZeros();
    }
}
