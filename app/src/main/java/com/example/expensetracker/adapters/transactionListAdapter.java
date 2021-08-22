package com.example.expensetracker.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.expensetracker.R;

public class transactionListAdapter extends RecyclerView.Adapter<transactionListAdapter.ViewHolder> {

    Context context;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.transaction_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView transactionListDate,transactionListIncome,transactionListExpense;
        RecyclerView transactionItemRecyclerView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            transactionListDate=(((RelativeLayout)itemView.findViewById(R.id.transactionInfoContainer)).findViewById(R.id.transactionListDate));
            transactionListIncome=(((RelativeLayout)itemView.findViewById(R.id.transactionInfoContainer)).findViewById(R.id.transactionListIncome));
            transactionListExpense=(((RelativeLayout)itemView.findViewById(R.id.transactionInfoContainer)).findViewById(R.id.transactionListExpense));
            transactionItemRecyclerView = itemView.findViewById(R.id.transactionItemRecyclerView);
        }
    }
}
