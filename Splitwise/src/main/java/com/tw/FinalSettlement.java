package com.tw;

public class FinalSettlement {
    String payeeFriend;
    String[] payers;
    Double settlementAmountPerFriend;

    public void setPayeeFriend(String payeeFriend) {
        this.payeeFriend = payeeFriend;
    }

    public void setPayers(String[] payers) {
        this.payers = payers;
    }

    public void setSettlementAmountPerFriend(Double settlementAmountPerFriend) {
        this.settlementAmountPerFriend = settlementAmountPerFriend;
    }

    @Override
    public String toString() {
        StringBuilder finalTransactionStatement = new StringBuilder();
        for (String payerFriend : payers) {
            if (!payerFriend.equals(payeeFriend)) {
                finalTransactionStatement.append(payerFriend)
                        .append(" pays ").append(payeeFriend)
                        .append(" ").append(settlementAmountPerFriend.intValue());
                if (!payerFriend.equals(payers[payers.length - 1])) {
                    finalTransactionStatement.append("\n");
                }
            }
        }
        return finalTransactionStatement.toString();
    }
}