package com.okellosoftwarez.zurutest.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.okellosoftwarez.zurutest.R;
import com.okellosoftwarez.zurutest.ui.model.Introduction;

import java.util.List;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>{

    private Context context;
    private List<Introduction> introductionList;

    public MainRecyclerAdapter(Context context, List<Introduction> introductionList) {
        this.context = context;
        this.introductionList = introductionList;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(context).inflate(R.layout.main_recycler_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.title.setText(introductionList.get(position).getTitle());
        holder.body.setText(introductionList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return introductionList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder
    {

        TextView title;
        TextView body;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView);
            body = itemView.findViewById(R.id.textView2);
        }
    }

}
