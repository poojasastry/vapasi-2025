package com.tw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExpenseCalculator {

    public List<InitialTransaction> readInputTransactionsFromFile(String path) {
        List<InitialTransaction> initialTransactionList = new ArrayList<>();
        try {
            Stream<String> transactionsRawFormat = Files.lines(Paths.get(path));
            initialTransactionList = transactionsRawFormat.map(singleTransaction -> {
                String[] record = singleTransaction.split(" ");
                return new InitialTransaction(record[0], Double.parseDouble(record[2]), record[6].trim().split(","));
            }).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return initialTransactionList;
    }

    public List<FinalSettlement> calculate(List<InitialTransaction> initialTransactionList) {
        List<FinalSettlement> finalTransactionsList = new ArrayList<>();
        for (InitialTransaction transaction : initialTransactionList) {
            FinalSettlement opTransaction = new FinalSettlement();
            String[] friendsAmountSpentForList = transaction.getFriendsAmountSpentFor();
            double amountSpentPerPerson = transaction.getTotalAmountSpent() / friendsAmountSpentForList.length;

            opTransaction.setPayeeFriend(transaction.getPayerName());
            opTransaction.setSettlementAmountPerFriend(amountSpentPerPerson);
            opTransaction.setPayers(friendsAmountSpentForList);

            finalTransactionsList.add(opTransaction);
        }
        return finalTransactionsList;
    }

}

