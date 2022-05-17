package com.example.drivo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drivo.model.Mobil;
import com.example.drivo.R;

import java.util.List;

public class TersediaDisekitarAdapter extends RecyclerView.Adapter<TersediaDisekitarAdapter.ViewHolder> {

    private Context context;
    private List<Mobil> tersediaDisekitar;

    public TersediaDisekitarAdapter(Context context, List<Mobil> tersediaDisekitar) {
        this.context = context;
        this.tersediaDisekitar = tersediaDisekitar;
    }

    @NonNull
    @Override
    public TersediaDisekitarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.tersedia_disekitar, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TersediaDisekitarAdapter.ViewHolder holder, int position) {

        holder.gambarMobil.setImageResource(tersediaDisekitar.get(position).getGambarMobil());
        holder.namaMobil.setText(tersediaDisekitar.get(position).getNamaMobil());
        holder.ratingMobil.setText(tersediaDisekitar.get(position).getRatingMobil());
        holder.hargaSewa.setText(tersediaDisekitar.get(position).getHargaSewa());

    }

    @Override
    public int getItemCount() {
        return tersediaDisekitar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView gambarMobil;
        private TextView namaMobil, ratingMobil, hargaSewa;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            gambarMobil = itemView.findViewById(R.id.item_mobil_preview);
            namaMobil = itemView.findViewById(R.id.nama_mobil);
            ratingMobil = itemView.findViewById(R.id.car_item_rating);
            hargaSewa = itemView.findViewById(R.id.car_item_price);

        }
    }
}