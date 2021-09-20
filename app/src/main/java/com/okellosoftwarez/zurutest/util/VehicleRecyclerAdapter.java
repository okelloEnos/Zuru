package com.okellosoftwarez.zurutest.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.okellosoftwarez.zurutest.R;
import com.okellosoftwarez.zurutest.ui.model.Category;
import com.okellosoftwarez.zurutest.ui.model.Introduction;

import java.util.List;

public class VehicleRecyclerAdapter extends RecyclerView.Adapter<VehicleRecyclerAdapter.VehicleViewHolder>{

    private Context context;
    private List<Category> categoryList;

    public VehicleRecyclerAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList= categoryList;
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VehicleViewHolder(LayoutInflater.from(context).inflate(R.layout.vehicle_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder holder, int position) {
        holder.vehicleName.setText(categoryList.get(position).getName());
        holder.driveType.setText(categoryList.get(position).getDriverType());
        holder.vehicleArea.setText(categoryList.get(position).getArea());
        holder.price.setText(categoryList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class VehicleViewHolder extends RecyclerView.ViewHolder
    {

        TextView driveType;
        TextView vehicleName;
        TextView vehicleArea;
        TextView price;


        public VehicleViewHolder(@NonNull View itemView) {
            super(itemView);
            driveType = itemView.findViewById(R.id.textView4);
            vehicleArea = itemView.findViewById(R.id.textView6);
            vehicleName = itemView.findViewById(R.id.textView5);
            price = itemView.findViewById(R.id.textView7);

        }
    }
}
