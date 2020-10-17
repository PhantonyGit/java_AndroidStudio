package com.example.tmlab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    Context context ;
    Vector<DataList>  dotaVector = new Vector<>();

    public ListAdapter(Context context) {

        this.context = context;
    }

    public void setListVector(Vector<DataList> listVector) {

        this.dotaVector = dotaVector;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, final int position) {
        //setdata
        holder.listname.setText(dotaVector.get(position).getDotalist());
        holder.listname.setText(String.valueOf(dotaVector.get(position).getStock()));

        holder.ItemCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Name: "+ dotaVector.get(position).getDotalist(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dotaVector.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView listname, liststock ;
        CardView ItemCardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //getdata
            listname = itemView.findViewById(R.id.listname);
            liststock = itemView.findViewById(R.id.liststock);
            ItemCardView = itemView.findViewById(R.id.ItemCardView);
        }
    }
}
