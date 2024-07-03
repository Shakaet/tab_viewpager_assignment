package com.example.tab_viewpager_practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recyclerview_adapter extends RecyclerView.Adapter<recyclerview_adapter.viewHolder> {


    private Context contx;

    private List<recycler_model_class> list;

    public recyclerview_adapter(Context contx, List<recycler_model_class> list) {
        this.contx = contx;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(contx);
        View view=inflater.inflate(R.layout.recycler_custom_layout2,null);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {


        recycler_model_class modelClass= list.get(position);

        holder.t1.setText(modelClass.getTitle());
        holder.t2.setText(modelClass.getDescription());
        holder.t3.setText(String.valueOf(modelClass.getRating()));
        holder.t4.setText(String.valueOf(modelClass.getPrice()));


        holder.img.setImageDrawable(contx.getResources().getDrawable(modelClass.getImg()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {

        TextView t1,t2,t3,t4;
        ImageView img;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            t1=itemView.findViewById(R.id.title);
            t2=itemView.findViewById(R.id.description);
            t3=itemView.findViewById(R.id.rating);
            t4=itemView.findViewById(R.id.price);
            img=itemView.findViewById(R.id.img);
        }
    }

}
