package com.example.drivo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drivo.model.Brand;
import com.example.drivo.model.Mobil;
import com.example.drivo.model.Grup;
import com.example.drivo.R;

import java.util.List;

public class GrupAdapter extends RecyclerView.Adapter<GrupAdapter.ViewHolder> {

    private Context context;
    private List<Grup> daftarGrup;
    private List<Brand> daftarTopBrand;
    private List<Mobil> daftarTersedia;

    public GrupAdapter(Context context, List<Grup> daftarGrup, List<Brand> daftarTopBrand, List<Mobil> daftarTersedia) {
        this.context = context;
        this.daftarGrup = daftarGrup;
        this.daftarTopBrand = daftarTopBrand;
        this.daftarTersedia = daftarTersedia;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_grup, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.judulGrup.setText(daftarGrup.get(position).getJudulGrup());
        holder.grupLihatSemua.setText(daftarGrup.get(position).getJudulButtonGrup());
        holder.setList(holder.recyclerView, position);

    }

    @Override
    public int getItemCount() {
        return daftarGrup.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView judulGrup;
        private TextView grupLihatSemua;
        private RecyclerView recyclerView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            judulGrup = itemView.findViewById(R.id.judul_grup);
            grupLihatSemua = itemView.findViewById(R.id.lihat_semua);
            recyclerView = itemView.findViewById(R.id.group_recyclerview);

        }

        public void setList(RecyclerView recyclerView, int position) {

            switch (position){

                case 0:

                    setTopBrandList(recyclerView);

                    break;

                case 1:

                    setAvailableNearList(recyclerView);

                    break;

            }

        }

    }

    private void setTopBrandList(RecyclerView recyclerView) {

        TopBrandAdapter adapter = new TopBrandAdapter(context, daftarTopBrand);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(true);

    }

    private void setAvailableNearList(RecyclerView recyclerView) {

        TersediaDisekitarAdapter adapter = new TersediaDisekitarAdapter(context, daftarTersedia);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(true);

    }
}