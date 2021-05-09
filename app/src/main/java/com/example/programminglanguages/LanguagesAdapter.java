package com.example.programminglanguages;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LanguagesAdapter extends RecyclerView.Adapter<LanguagesAdapter.LanguagesViewHolder> {


    List<LanguagesModel> list;
    LayoutInflater inflater;
    Context context;

    public LanguagesAdapter(List<LanguagesModel> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public LanguagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_my_row, parent, false);
        return new LanguagesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguagesViewHolder holder, int position) {
        holder.txtTitle.setText(list.get(position).getName());
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AboutItemActivity.class);
                intent.putExtra("language", list.get(position).getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LanguagesViewHolder extends RecyclerView.ViewHolder {

        TextView txtTitle;
        ImageView imageView;

        public LanguagesViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.title_txt);
            imageView = itemView.findViewById(R.id.imageView_jpg);
        }
    }
}
