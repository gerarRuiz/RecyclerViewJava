package com.example.recyclerviewjava;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewjava.databinding.ListItemBinding;

import java.util.ArrayList;

public class MuroAdapter extends RecyclerView.Adapter<MuroAdapter.ViewHolder> {

    private ArrayList<Muro> muroArrayList;
    private MuroOnClickListener muroOnClickListener;

    public MuroAdapter(ArrayList<Muro> muroArrayList, MuroOnClickListener muroOnClickListener) {
        this.muroArrayList = muroArrayList;
        this.muroOnClickListener = muroOnClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding binding = ListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Muro item = muroArrayList.get(position);
        holder.bind(item, muroOnClickListener);

    }

    @Override
    public int getItemCount() {
        return muroArrayList != null ? muroArrayList.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ListItemBinding binding;

        public ViewHolder(@NonNull ListItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }


        public void bind(Muro muro, MuroOnClickListener muroOnClickListener) {

            binding.getRoot().setOnClickListener(v -> muroOnClickListener.onClick(muro));
            binding.imageViewMain.setImageResource(muro.getFoto());
            binding.textViewMuro.setText(muro.getPost());
            binding.imageViewFeeling.setImageResource(muro.getFotoUser());
            binding.textViewUserName.setText(muro.getNameUser());

        }


    }


}
