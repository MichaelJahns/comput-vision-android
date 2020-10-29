package com.michaeljahns.computervision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TransformAdapter extends RecyclerView.Adapter<TransformAdapter.ViewHolder> {

    String transformTypes[], transformDescriptions[];
    Context context;

    public TransformAdapter(Context context,
                            String[] transformTypes,
                            String[] transformDescriptions) {
        this.context = context;
        this.transformTypes = transformTypes;
        this.transformDescriptions = transformDescriptions;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.transform_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.transformType.setText(transformTypes[position]);
        holder.transformDescription.setText(transformDescriptions[position]);
//        holder.transformImage.setImageResource(transformTypes[position]);
    }

    @Override
    public int getItemCount() {
        return transformTypes.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView transformType, transformDescription;
        ImageView transformImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.transformType = itemView.findViewById(R.id.transformType);
            this.transformDescription = itemView.findViewById(R.id.transformDescription);
            this.transformImage = itemView.findViewById(R.id.transformImage);
        }
    }
}
