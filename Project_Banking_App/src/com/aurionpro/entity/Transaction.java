package com.aurionpro.entity;

import java.util.Date;

public class Transaction {
    private int transactionId;
    private String sendersAccountNumber;
    private String receiversAccountNumber;
    private String typeOfTransfer;
    private double amount;
    private Date date;

    public Transaction(int transactionId, String sendersAccountNumber, String receiversAccountNumber, String typeOfTransfer, double amount, Date date) {
        this.transactionId = transactionId;
        this.sendersAccountNumber = sendersAccountNumber;
        this.receiversAccountNumber = receiversAccountNumber;
        this.typeOfTransfer = typeOfTransfer;
        this.amount = amount;
        this.date = date;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getSendersAccountNumber() {
        return sendersAccountNumber;
    }

    public String getReceiversAccountNumber() {
        return receiversAccountNumber;
    }

    public String getTypeOfTransfer() {
        return typeOfTransfer;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
}
