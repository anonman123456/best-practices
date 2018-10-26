package org.exercises.calculator.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class FormulaTest {

    @InjectMocks
    private FormulaService formulaService = new FormulaService();
    @Mock
    private Calculator calculator;

    @Test
    public void testSecondsPassedStartsAtZero() {
        Assert.assertEquals(0, formulaService.timeElapsed);
    }

    @Test
    public void testEachCycleHappensAfter5Seconds(){
        BigDecimal randomNumber = BigDecimal.valueOf(Math.random());
        BigDecimal timeIncrement = BigDecimal.valueOf(FormulaService.INCREMENT_5);

        // when calling .add with values 0,5 --> return a random number
        Mockito.when(calculator.add(BigDecimal.valueOf(0), timeIncrement)).thenReturn(timeIncrement);
        // add 5 seconds to elapsed time (uses .add from calculator)
        formulaService.addTheTimeElapsed();

        // check if calculator .add is called with values 0,5
        Mockito.verify(calculator).add(BigDecimal.valueOf(0), timeIncrement);

        // check if no other methods from calculator are used
        Mockito.verifyNoMoreInteractions(calculator);

        // no clue what the assert should do
        Assert.assertEquals(000000, 9999);
    }
}