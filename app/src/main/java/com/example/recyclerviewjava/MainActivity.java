package com.example.recyclerviewjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerviewjava.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MuroOnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Muro> muroArrayList = new ArrayList<>();
        muroArrayList.add(new Muro(R.drawable.ic_cake, "Bienvenido Alfredo", R.drawable.ic_happy, "Alfredo Trujeque"));
        muroArrayList.add(new Muro(R.drawable.ic_cake, "Bienvenido Gerardo", R.drawable.ic_happy, "Gerardo Ruiz"));
        muroArrayList.add(new Muro(R.drawable.ic_cake, "Bienvenido Alfredo", R.drawable.ic_happy, "Alfredo Trujeque"));
        muroArrayList.add(new Muro(R.drawable.ic_cake, "Bienvenido Gerardo", R.drawable.ic_happy, "Gerardo Ruiz"));

        MuroAdapter muroAdapter = new MuroAdapter(muroArrayList, this);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        binding.recyclerView.setAdapter(muroAdapter);

    }

    @Override
    public void onClick(Muro muro) {
        Toast.makeText(this, muro.toString(), Toast.LENGTH_SHORT).show();
    }


}