package com.tw.util;

import com.tw.entity.InitialTransaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputFileReader {
    public List<InitialTransaction> readInputTransactionsFromFile(String path) {
        List<InitialTransaction> initialTransactionList = new ArrayList<>();
        try {
            Stream<String> transactionsRawFormat = Files.lines(Paths.get(path));
            initialTransactionList = transactionsRawFormat.map(singleTransaction -> {
                String[] record = singleTransaction.split(" ");
                String[] arrayOfFriendsAmountSpentFor = Arrays.stream(singleTransaction.split(" for "))
                        .skip(2)
                        .findFirst()
                        .map(part -> part.split(",\\s*"))
                        .orElse(new String[0]);
                return new InitialTransaction(record[0], Double.parseDouble(record[2]), arrayOfFriendsAmountSpentFor);
            }).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return initialTransactionList;
    }
}

