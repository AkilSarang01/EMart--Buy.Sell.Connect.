package com.akilsrg.mgmcete_mart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class EventAdapter extends RecyclerView .Adapter<EventAdapter.ViewHolder>{

    ArrayList<EModel>list;
    Context context;

    public EventAdapter(ArrayList<EModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.event_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        EModel model = list.get(position);

        Picasso.get().load(model.getImgView()).placeholder(R.drawable.ic_launcher_background).into(holder.EventImageView);

        holder.nameTextView.setText(model.getEd3());
        holder.date.setText(model.getEd1());
        holder.time.setText(model.getEd2());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{

        TextView nameTextView,date,time;
        ImageView EventImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.nameTextView);
            date = itemView.findViewById(R.id.date);
            time = itemView.findViewById(R.id.time);
            EventImageView = itemView.findViewById(R.id.EventImageView);

        }
    }
}
