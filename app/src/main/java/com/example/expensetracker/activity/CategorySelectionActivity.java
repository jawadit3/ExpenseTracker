package com.example.expensetracker.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.widget.GridView;

import com.example.expensetracker.R;
import com.example.expensetracker.adapters.CategoryItemAdapter;

public class CategorySelectionActivity extends AppCompatActivity {

    RecyclerView categoryItemRecyclerView;
    String numArray[] = {"one","two","three","four"};
    int iconArray[] = {R.drawable.ic_baseline_calendar_today_24,R.drawable.ic_baseline_calendar_today_24,R.drawable.ic_baseline_calendar_today_24,R.drawable.ic_baseline_calendar_today_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selection);
        setSupportActionBar(((CardView)findViewById(R.id.toolbarParentSecondActivity)).findViewById(R.id.toolbar));
        categoryItemRecyclerView = findViewById(R.id.categoryItemRecyclerView);
        CategoryItemAdapter myAdapter = new CategoryItemAdapter(numArray,iconArray,this);
        categoryItemRecyclerView.setLayoutManager(new GridLayoutManager(this,4));
        categoryItemRecyclerView.setAdapter(myAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.category_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}