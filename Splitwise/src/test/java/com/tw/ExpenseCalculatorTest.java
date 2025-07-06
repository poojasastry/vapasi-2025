package com.tw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseCalculatorTest {

    private static ExpenseCalculator expenseCalculator;

    @BeforeAll
    public static void init() {
        expenseCalculator = new ExpenseCalculator();
    }

    @Test
    void shouldReturnNonNullListFromFile() {
        String path = "src/test/java/input";
        List<InitialTransaction> initialTransactionList = expenseCalculator.readInputTransactionsFromFile(path);
        assertNotNull(initialTransactionList);
    }

    @Test
    void shouldReturnSixItemsFromEachTransaction() {
        String path = "src/test/java/input";
        List<InitialTransaction> initialTransactionList = expenseCalculator.readInputTransactionsFromFile(path);
        assertEquals(4, initialTransactionList.getFirst().friendsAmountSpentFor.length);
    }


}