package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomeAdapter extends RecyclerView.Adapter<CustomeAdapter.MyViewHolder> {

    ArrayList<dataModel> dataset ;

    public CustomeAdapter(ArrayList<dataModel> dataSet) {
        this.dataset = dataSet ;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName ;
        TextView textViewVersion ;
        ImageView imageView ;



        public MyViewHolder(View itemView){
            super(itemView);

            textViewName = itemView.findViewById(R.id.textView);
            textViewVersion = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(v -> Toast.makeText(v.getContext(), "Name: " + textViewVersion.getText(), Toast.LENGTH_SHORT).show());

        }
    }


    @NonNull
    @Override
    public CustomeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout , parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomeAdapter.MyViewHolder holder, int position) {
        TextView textViewName = holder.textViewName ;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageView;

        textViewName.setText(dataset.get(position).getName());
        textViewVersion.setText(dataset.get(position).getVersion());
        imageView.setImageResource(dataset.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
