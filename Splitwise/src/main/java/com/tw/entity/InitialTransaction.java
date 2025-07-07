package com.tw.entity;

public class InitialTransaction {
    String payerName;
    double totalAmountSpent;
    String[] friendsAmountSpentFor;

    public InitialTransaction(String payerName, double totalAmountSpent, String[] friendsAmountSpentFor) {
        this.payerName = payerName;
        this.totalAmountSpent = totalAmountSpent;
        this.friendsAmountSpentFor = friendsAmountSpentFor;
    }

    public String getPayerName() {
        return payerName;
    }

    public double getTotalAmountSpent() {
        return totalAmountSpent;
    }

    public String[] getFriendsAmountSpentFor() {
        return friendsAmountSpentFor;
    }

    @Override
    public String toString() {
        return "InputTransactions{" +
                "payerName='" + payerName + '\'' +
                ", totalAmountSpent=" + totalAmountSpent +
                ", friendsAmountSpentFor=" + friendsAmountSpentFor +
                '}';
    }
}
