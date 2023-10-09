package com.example.treecount;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<ProjetK> dataModelList;

    public RecyclerAdapter(List<ProjetK> dataModelList) {
        this.dataModelList = dataModelList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_planets, parent, false);
        viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.RecyclerViewHolder holder, int position) {
        holder.textViewTitre.setText(dataModelList.get(position).getTitre());
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView textViewTitre;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitre = itemView.findViewById(R.id.textViewTitre);
        }
    }
}
