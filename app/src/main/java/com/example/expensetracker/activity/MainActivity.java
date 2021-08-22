package com.example.expensetracker.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;

import com.example.expensetracker.database.TransactionDataSource;
import com.example.expensetracker.fragment.DatePickerFragment;
import com.example.expensetracker.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    FloatingActionButton addTransactionButton;
    private TransactionDataSource transactionDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) (findViewById(R.id.toolbarParent).findViewById(R.id.toolbar));
        setSupportActionBar(toolbar);
        /*Spinner spinner = findViewById(R.id.mySpinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.monthsArray));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);*/
        transactionDataSource = new TransactionDataSource(this);
        transactionDataSource.open();
        addTransactionButton = findViewById(R.id.addTransactionButton);
        addTransactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(MainActivity.this, CategorySelectionActivity.class));
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        transactionDataSource.open();
    }

    @Override
    protected void onPause() {
        super.onPause();
        transactionDataSource.close();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.calendar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.item1){
            DialogFragment datePicker = new DatePickerFragment();
            datePicker.show(getSupportFragmentManager(),"Select date");

        }
        
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        getSupportActionBar().setTitle(dayOfMonth+"/"+month+"/"+year);
    }
}