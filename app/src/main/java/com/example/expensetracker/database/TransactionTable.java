package com.example.expensetracker.database;

public class TransactionTable {

    public static final String TABLE_TRANSACTION="tbl_transaction";
    public static final String COLUMN_ID="transactionId";
    public static final String COLUMN_NAME="transactionName";
    public static final String COLUMN_TYPE="transactionType";
    public static final String COLUMN_ICON="transactionIcon";
    public static final String COLUMN_AMOUNT="transactionAmount";
    public static final String ALL_COLUMNS [] = new String[]{COLUMN_ID,COLUMN_NAME,COLUMN_TYPE,COLUMN_ICON,COLUMN_AMOUNT};
    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_TRANSACTION + "(" +
                    COLUMN_ID + "TEXT PRIMARY KEY,"  +
                    COLUMN_NAME + "TEXT," +
                    COLUMN_TYPE + "TEXT," +
                    COLUMN_ICON + "NUMBER," +
                    COLUMN_AMOUNT + "NUMBER);";
    public static final String SQL_DELETE =
            "DROP TABLE IF EXISTS" + TABLE_TRANSACTION;

}
