package com.example.expensetracker.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

import com.example.expensetracker.model.TransactionDataItem;

import java.util.ArrayList;
import java.util.List;

public class TransactionDataSource {
    private Context context;
    private MyDBOpenHelper myDBOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public TransactionDataSource(Context context) {
        this.context = context;
        this.myDBOpenHelper = new  MyDBOpenHelper(context);
        this.sqLiteDatabase = sqLiteDatabase;
    }

    public void insertItem(TransactionDataItem item){
        ContentValues values = item.getContenValues();
        sqLiteDatabase.insert(TransactionTable.TABLE_TRANSACTION,null,values);
    }

    public void open(){
        sqLiteDatabase=myDBOpenHelper.getWritableDatabase();
    }
    public void close(){
        sqLiteDatabase.close();
    }
    public long getItemsCount(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,TransactionTable.TABLE_TRANSACTION);
    }
    public List<TransactionDataItem> getAllItems(){
        List<TransactionDataItem> transactionDataItemList = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.query(TransactionTable.TABLE_TRANSACTION,TransactionTable.ALL_COLUMNS,null,null,null,null,null);
        while (cursor.moveToNext()){
            TransactionDataItem transactionDataItem = new TransactionDataItem();
            transactionDataItem.setTransactionId(cursor.getString(cursor.getColumnIndex(TransactionTable.COLUMN_ID)));
            transactionDataItem.setTransactionId(cursor.getString(cursor.getColumnIndex(TransactionTable.COLUMN_ID)));
            transactionDataItem.setTransactionId(cursor.getString(cursor.getColumnIndex(TransactionTable.COLUMN_ID)));
            transactionDataItem.setTransactionId(cursor.getString(cursor.getColumnIndex(TransactionTable.COLUMN_ID)));
            transactionDataItem.setTransactionId(cursor.getString(cursor.getColumnIndex(TransactionTable.COLUMN_ID)));
            transactionDataItemList.add(transactionDataItem);

        }
        return transactionDataItemList;
    }
}
