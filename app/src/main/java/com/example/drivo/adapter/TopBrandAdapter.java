package com.example.drivo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drivo.R;
import com.example.drivo.model.Brand;

import java.util.List;

public class TopBrandAdapter extends RecyclerView.Adapter<TopBrandAdapter.ViewHolder> {

    private Context context;
    private List<Brand> daftarTopBrand;

    public TopBrandAdapter(Context context, List<Brand> topBrandList) {
        this.context = context;
        this.daftarTopBrand = topBrandList;

    }

    @NonNull
    @Override
    public TopBrandAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.top_brand, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopBrandAdapter.ViewHolder holder, int position) {

        holder.brandLogo.setImageResource(daftarTopBrand.get(position).getBrandLogo());

    }

    @Override
    public int getItemCount() {
        return daftarTopBrand.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView brandLogo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            brandLogo = itemView.findViewById(R.id.brand_item_logo);

        }
    }
}

