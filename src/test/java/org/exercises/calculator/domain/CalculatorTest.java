package org.exercises.calculator.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void addingTwoPositiveWholeNumbersShouldReturnCorrectResult(){
        BigDecimal number1 = new BigDecimal(5000);
        BigDecimal number2 = new BigDecimal(5000);
        BigDecimal expectedResult = new BigDecimal(10000);
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void addingTwoNegativeWholeNumbersShouldReturnCorrectResult(){
        BigDecimal number1 = new BigDecimal(-100);
        BigDecimal number2 = new BigDecimal(-100);
        BigDecimal expectedResult = new BigDecimal(-200);
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void addingNegativeAndPositiveWholeNumbersShouldReturnCorrectResult(){
        BigDecimal number1 = new BigDecimal(100);
        BigDecimal number2 = new BigDecimal(-100);
        BigDecimal expectedResult = new BigDecimal(0);
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void addingTwoPositiveDecimalNumbersShouldReturnCorrectResult(){
        BigDecimal number1 = new BigDecimal(5000.5);
        BigDecimal number2 = new BigDecimal(5000.4);
        BigDecimal expectedResult = new BigDecimal(10000.9).setScale(1,RoundingMode.HALF_UP);;
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void addingTwoNegativeDecimalNumbersShouldReturnCorrectResult(){
        BigDecimal number1 = new BigDecimal(-1000.25);
        BigDecimal number2 = new BigDecimal(-1000.25);
        BigDecimal expectedResult = new BigDecimal(-2000.5);
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void addingPositiveAndNegativeDecimalNumbersShouldReturnCorrectResult(){
        BigDecimal number1 = new BigDecimal(-1000.25);
        BigDecimal number2 = new BigDecimal(1000.25);
        BigDecimal expectedResult = new BigDecimal(0);
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void addingPositiveDecimalWith0ShouldReturnCorrectResult(){
        BigDecimal number1 = new BigDecimal(1000.1);
        BigDecimal number2 = new BigDecimal(0);
        BigDecimal expectedResult = new BigDecimal(1000.1).setScale(4,RoundingMode.HALF_UP);;
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void addingNegativeDecimalWith0ShouldReturnCorrectResult(){
        BigDecimal number1 = new BigDecimal(-1000);
        BigDecimal number2 = new BigDecimal(0);
        BigDecimal expectedResult = new BigDecimal(-1000).setScale(4,RoundingMode.HALF_UP);;
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void addingPositiveWholeNumberWith0ShouldReturnCorrectResult(){
        BigDecimal number1 = new BigDecimal(1000);
        BigDecimal number2 = new BigDecimal(0);
        BigDecimal expectedResult = new BigDecimal(1000);
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void addingNegativeWholeNumberWith0ShouldReturnCorrectResult(){
        BigDecimal number1 = new BigDecimal(-9522);
        BigDecimal number2 = new BigDecimal(0);
        BigDecimal expectedResult = new BigDecimal(-9522);
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void resultShouldRoundTo4Decimals(){
        BigDecimal number1 = new BigDecimal(10.1111111);
        BigDecimal number2 = new BigDecimal(1.11111111111111);
        BigDecimal expectedResult = new BigDecimal(11.2222).setScale(4,RoundingMode.HALF_UP);;
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void resultShouldNotHaveLeadingZerosAfter4Decimals(){
        BigDecimal number1 = new BigDecimal(1000.1000000);
        BigDecimal number2 = new BigDecimal(1000.1000000);
        BigDecimal expectedResult = new BigDecimal(2000.2).setScale(1, RoundingMode.HALF_UP);;
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void adding2DecimalNumbersShouldRoundUp(){
        BigDecimal number1 = new BigDecimal(0.00005);
        BigDecimal number2 = new BigDecimal(0.00005);
        BigDecimal expectedResult = new BigDecimal(0.0001).setScale(4, RoundingMode.HALF_UP);;
        Assert.assertEquals(0, expectedResult.compareTo(calc.add(number1, number2)));
    }

    @Test
    public void shouldCalculateCorrectSqrtOfDecimalAndRoundOf(){
        BigDecimal number1 = new BigDecimal(4.0000000);
        BigDecimal expectedResult = new BigDecimal(2).setScale(4, RoundingMode.HALF_UP);;
        Assert.assertEquals(0, expectedResult.compareTo(calc.sqrt(number1)));
    }


}