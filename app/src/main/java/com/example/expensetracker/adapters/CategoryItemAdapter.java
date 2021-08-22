package com.example.expensetracker.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.expensetracker.R;

public class CategoryItemAdapter extends RecyclerView.Adapter<CategoryItemAdapter.ViewHolder> {
    String numArray[];
    int iconArray[];
    Context context;

    public CategoryItemAdapter(String[] numArray, int[] iconArray, Context context) {
        this.numArray = numArray;
        this.iconArray = iconArray;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.category_item,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(R.drawable.ic_baseline_calendar_today_24);
    }



    @Override
    public int getItemCount() {
        return iconArray.length;
    }



        class ViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView=((ImageView)(itemView.findViewById(R.id.category_img)));
            }
        }
}
