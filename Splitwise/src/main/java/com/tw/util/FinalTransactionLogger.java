package com.tw.util;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class FinalTransactionLogger {
    Logger LOGGER = Logger.getLogger(FinalTransactionLogger.class.getName());

    public void printFinalTransactions(Map<List<String>, Double> finalMap) {
        StringBuilder finalTransactionStatement = new StringBuilder();
        String message = "List of transactions -";
        finalTransactionStatement.append("\n")
                .append(message)
                .append("\n");

        for (Map.Entry<List<String>, Double> entry : finalMap.entrySet()) {
            List<String> payerAndPayeeList = entry.getKey();
            Double paymentValue = entry.getValue();
            finalTransactionStatement.append(payerAndPayeeList.get(0))
                    .append(" pays ")
                    .append(payerAndPayeeList.get(1))
                    .append(" ")
                    .append(paymentValue.intValue())
                    .append("\n");
        }
        LOGGER.info(finalTransactionStatement.toString());
    }
}
