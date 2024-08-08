package com.example.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.DataViewHolder>{
    String[] cou={};
    String[] cap={};

    public CountryAdapter(String[] country, String[] capital) {
        cou = country;
        cap = capital;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_item, parent, false);
        DataViewHolder dataViewHolder = new DataViewHolder(view);
        return dataViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        holder.itemTxtCountry.setText(cou[position]);
        holder.itemTxtCapital.setText(cap[position]);
    }

    @Override
    public int getItemCount() {
        return cou.length;
    }

    class DataViewHolder extends RecyclerView.ViewHolder{
        TextView itemTxtCountry, itemTxtCapital;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTxtCountry = itemView.findViewById(R.id.itemTxtCountry);
            itemTxtCapital = itemView.findViewById(R.id.itemTxtCapital);
        }
    }
}
