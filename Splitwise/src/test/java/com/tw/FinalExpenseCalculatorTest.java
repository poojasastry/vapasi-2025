package com.tw;

import com.tw.entity.InitialTransaction;
import com.tw.service.FinalExpenseCalculator;
import com.tw.util.InputFileReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FinalExpenseCalculatorTest {
    private static FinalExpenseCalculator finalExpenseCalculator;

    @BeforeAll
    public static void init() {
        finalExpenseCalculator = new FinalExpenseCalculator();
    }

    InputFileReader inputFileReader = new InputFileReader();
    List<InitialTransaction> initialTransactionList = inputFileReader.readInputTransactionsFromFile("src/test/java/input2");

    @Test
    void shouldReturnCorrectPayerName() {
        assertNotNull(initialTransactionList);
        assertEquals("A", initialTransactionList.getFirst().getPayerName());
    }

    @Test
    void shouldAReturnFourPayees() {
        assertEquals(4,initialTransactionList.getFirst().getFriendsAmountSpentFor().length);
    }

    @Test
    void shouldReturnExpectedAmount() {
        assertEquals(25.0,(initialTransactionList.getFirst().getTotalAmountSpent()/initialTransactionList.getFirst().getFriendsAmountSpentFor().length));
    }

    @Test
    void shouldAggregateExpensesBetweenSamePayerAndPayee() {
        Map<List<String>,Double> finalExpenseMap = finalExpenseCalculator.calculateFinalExpenses(initialTransactionList);
        System.out.println(finalExpenseMap);
        assertTrue(finalExpenseMap.containsValue(75.0));
        assertTrue(finalExpenseMap.containsValue(25.0));
    }

}
