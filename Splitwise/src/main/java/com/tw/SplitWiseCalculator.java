package com.tw;

import com.tw.entity.InitialTransaction;
import com.tw.service.FinalExpenseCalculator;
import com.tw.util.FinalTransactionLogger;
import com.tw.util.InputFileReader;

import java.util.List;
import java.util.Map;

public class SplitWiseCalculator {
    public static void main(String[] args) {
        String inputTransactionsFilePath = "Splitwise/src/main/resources/input";

        InputFileReader inputFileReader = new InputFileReader();
        List<InitialTransaction> inputTransactionsListFormatted = inputFileReader.readInputTransactionsFromFile(inputTransactionsFilePath);

        FinalExpenseCalculator currentTourSplitWiseCalculation = new FinalExpenseCalculator();
        Map<List<String>, Double> finalTransactions = currentTourSplitWiseCalculation.calculateFinalExpenses(inputTransactionsListFormatted);

        FinalTransactionLogger finalTransactionLogger = new FinalTransactionLogger();
        finalTransactionLogger.printFinalTransactions(finalTransactions);
    }
}
