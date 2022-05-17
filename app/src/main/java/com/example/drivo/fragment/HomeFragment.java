package com.example.drivo.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drivo.R;
import com.example.drivo.adapter.GrupAdapter;
import com.example.drivo.model.Brand;
import com.example.drivo.model.Mobil;
import com.example.drivo.model.Grup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private Context mContext;
    private RecyclerView recyclerView;
    private List<Grup> daftarGrup;
    private List<Brand> daftarTopBrand;
    private List<Mobil> daftarTersediaDisekitar;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setAdapterType(view);
        setAdapter();

    }

    private void setAdapter() {

        initDataGrup();
        initDataMobil();

        GrupAdapter grupAdapter = new GrupAdapter(mContext, daftarGrup, daftarTopBrand, daftarTersediaDisekitar);
        recyclerView.setAdapter(grupAdapter);

    }

    private void initDataMobil() {

        daftarTopBrand = new ArrayList<>();
        daftarTersediaDisekitar = new ArrayList<>();

        daftarTopBrand.add(new Brand(R.drawable.brand_logo_1));
        daftarTopBrand.add(new Brand(R.drawable.brand_logo_2));
        daftarTopBrand.add(new Brand(R.drawable.brand_logo_3));
        daftarTopBrand.add(new Brand(R.drawable.brand_logo_4));
        daftarTopBrand.add(new Brand(R.drawable.brand_logo_5));


        daftarTersediaDisekitar.add(new Mobil("Land Rover", "4.4", "1.4jt/hari", R.drawable.mobil_1));
        daftarTersediaDisekitar.add(new Mobil("Ford", "4.1", "1jt/hari", R.drawable.mobil_2));
        daftarTersediaDisekitar.add(new Mobil("Acura", "3.9", "900rb/hari", R.drawable.mobil_3));
        daftarTersediaDisekitar.add(new Mobil("Alfa Romeo", "4.6", "1.6jt/hari", R.drawable.mobil_4));
        daftarTersediaDisekitar.add(new Mobil("Nissan", "4.3", "1.3jt/hari", R.drawable.mobil_5));
        daftarTersediaDisekitar.add(new Mobil("Camaro", "4.2", "1.2jt/hari", R.drawable.mobil_6));
    }

    private void initDataGrup() {

        daftarGrup = new ArrayList<>();
        daftarGrup.add(new Grup("Brand Terbaik", "Lihat Semua"));
        daftarGrup.add(new Grup("Tersedia di Sekitar Anda", "Lihat Semua"));

    }

    private void setAdapterType(View view) {

        recyclerView = view.findViewById(R.id.home_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }
}