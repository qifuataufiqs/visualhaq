package com.qifuataufiqs.myrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CorehaqAdapter extends RecyclerView.Adapter<CorehaqAdapter.CategoryViewHolder> {

    private Context context;

    public ArrayList<CoreHaq> getListCorehaq() {
        return listCorehaq;
    }

    public void setListCorehaq(ArrayList<CoreVisual> listCorehaq) {
        this.listCorehaq = listCorehaq;
    }

    public CorehaqAdapter(Context context) {
        this.context = context;
    }
    private ArrayList<CoreHaq>listCorehaq;

    @NonNull
    @Override
    public CorehaqAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row_corehaq, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.setNama.setText(getListCorehaq().get(position).getNama());
        holder.setposisi.setText(getListCorehaq().get(position).getNama);

        Glide.with(context)
                .load(getListCorehaq().get(position).getFoto())
                .override(55, 55)
                .crossFade()
                .into(holder.imgFoto);
    }

    @Override
    public int getItemCount() {
        return getListCorehaq().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
        TextView tvPosisi;
        ImageView imgFoto;

        public CategoryViewHolder(View itemView) {
            super(itemView);

            tvNama = (TextView)itemView.findViewById(R.id._tv_item_nama);
            tvPosisi = (TextView)itemView.findViewById(R.id._tv_item_posisi);
            imgFoto = (ImageView) itemView.findViewById(R.id._tv_item_foto);
        }
    }
}
