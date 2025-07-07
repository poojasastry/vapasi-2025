package com.tw.service;

import com.tw.entity.InitialTransaction;

import java.util.*;

public class FinalExpenseCalculator {

    public Map<List<String>, Double> calculateFinalExpenses(List<InitialTransaction> initialTransactionList) {
        Map<List<String>, Double> finalTransactionMap = new LinkedHashMap<>();

        for (InitialTransaction transaction : initialTransactionList) {
            String[] friendsAmountSpentFor = transaction.getFriendsAmountSpentFor();
            double amountSpentPerPerson = transaction.getTotalAmountSpent() / friendsAmountSpentFor.length;

            for (String friendAmountSpentFor : friendsAmountSpentFor) {
                List<String> payerAndPayeeList = new ArrayList<>();

                if (!friendAmountSpentFor.equals(transaction.getPayerName())) {
                    payerAndPayeeList.add(friendAmountSpentFor);
                    payerAndPayeeList.add(transaction.getPayerName());

                    if (!finalTransactionMap.containsKey(payerAndPayeeList)) {
                        finalTransactionMap.put(payerAndPayeeList, amountSpentPerPerson);
                    } else {
                        Double updatedAmountForCurrentPayer = amountSpentPerPerson + finalTransactionMap.get(payerAndPayeeList);
                        finalTransactionMap.put(payerAndPayeeList, updatedAmountForCurrentPayer);
                    }
                }
            }
        }
        return finalTransactionMap;
    }
}
