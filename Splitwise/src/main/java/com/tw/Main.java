package com.tw;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExpenseCalculator currentTourSplitwiseCalculation = new ExpenseCalculator();
        String inputTransactionsFilePath = "Splitwise/src/main/resources/input";
        List<InitialTransaction> inputTransactionsListFormatted = currentTourSplitwiseCalculation.readInputTransactionsFromFile(inputTransactionsFilePath);
        List<FinalSettlement> finalSettlementsList = currentTourSplitwiseCalculation.calculate(inputTransactionsListFormatted);
        for (FinalSettlement finalSettlement : finalSettlementsList) {
            System.out.println(finalSettlement.toString());
        }
    }
}
