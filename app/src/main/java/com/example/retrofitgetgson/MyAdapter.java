package com.example.retrofitgetgson;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<User> dataModelArrayList;
    private Context mContext;

    public MyAdapter(Context ctx, ArrayList<User> dataModelArrayList) {
        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
        mContext = ctx;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.e("id--------: ", String.valueOf(dataModelArrayList.get(position).getId()));
        Log.e("name--------: ", String.valueOf(dataModelArrayList.get(position).getName()));
        Log.e("status--------: ", String.valueOf(dataModelArrayList.get(position).getStatus()));

        holder.idT.setText(dataModelArrayList.get(position).getId() + "");
        holder.nameT.setText(dataModelArrayList.get(position).getName());
        holder.emailT.setText(dataModelArrayList.get(position).getEmail());
        holder.genderT.setText(dataModelArrayList.get(position).getGender());
        holder.statusT.setText(dataModelArrayList.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        AppCompatTextView idT, nameT, emailT, genderT, statusT;

        public MyViewHolder(final View itemView) {
            super(itemView);

            idT =  itemView.findViewById(R.id.idT);
            nameT = itemView.findViewById(R.id.nameT);
            emailT = itemView.findViewById(R.id.emailT);
            genderT = itemView.findViewById(R.id.genderT);
            statusT = itemView.findViewById(R.id.statusT);

        }
    }
}
