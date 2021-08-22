package com.example.expensetracker.model;

import android.content.ContentValues;

import com.example.expensetracker.database.TransactionTable;

public class TransactionDataItem {

    public String transactionId;
    private String transactionName;
    private String transactionType;
    private int transactionIcon;
    private int transactionAmount;

    public TransactionDataItem() {
    }

    public TransactionDataItem(String transactionId, String transactionName, String transactinType, int transactionIcon, int transactionAmount) {
        this.transactionId = transactionId;
        this.transactionName = transactionName;
        this.transactionType = transactinType;
        this.transactionIcon = transactionIcon;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getTransactinType() {
        return transactionType;
    }

    public void setTransactinType(String transactinType) {
        this.transactionType = transactinType;
    }

    public int getTransactionIcon() {
        return transactionIcon;
    }

    public void setTransactionIcon(int transactionIcon) {
        this.transactionIcon = transactionIcon;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public ContentValues getContenValues(){
        ContentValues values = new ContentValues(5);
        values.put(TransactionTable.COLUMN_ID,transactionId);
        values.put(TransactionTable.COLUMN_NAME,transactionName);
        values.put(TransactionTable.COLUMN_TYPE,transactionType);
        values.put(TransactionTable.COLUMN_AMOUNT,transactionAmount);
        values.put(TransactionTable.COLUMN_ICON,transactionIcon);
        return values;
    }

    @Override
    public String  toString() {
        return "TransactionDataItem{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionName='" + transactionName + '\'' +
                ", transactinType='" + transactionType + '\'' +
                ", transactionIcon=" + transactionIcon +
                ", transactionAmount=" + transactionAmount +
                '}';
    }
}
