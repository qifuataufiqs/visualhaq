package com.qifuataufiqs.myrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewCorehaqAdapter extends RecyclerView.Adapter<CardViewCorehaqAdapter.CardViewViewHolder> {

    private ArrayList<CoreVisual> listCoreVisual;
    private Context context;

    public CardViewCorehaqAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<CoreVisual> getListCoreVisual() {
        return listCoreVisual;
    }

    public void setListCoreVisual(ArrayList<CoreVisual> listCoreVisual) {
        this.listCoreVisual = listCoreVisual;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup paranet, int viewType) {
        View view = LayoutInflater.from(paranet.getContext())
                .inflate(R.layout.item_cardview_corehaq, paranet, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        CoreVisual p = getListCoreVisual().get(position);

        Glide.with(context)
                .load(p.getFoto())
                .override(350, 550)
                .into(holder.imgFoto);
        holder.tvNama.setText(p.getNama());
        holder.tvNama.setText(p.getPosisi());

        holder.btnProfil.setOnClickListener(new CustomOnItemClickListener(
                position, new CustomOnItemClickListener.OnItemClickCallback() {

                @Override
                public void onItemClicked(View view, int position) {
                    Toast.makeText(context, "Profil "+ getListCoreVisual().get(position).getNama(),
                            Toast.LENGTH_SHORT).show();
                }
            }
        ));

        holder.btnBagikan.setOnClickListener(new CustomOnItemClickListener(
                position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Bagikan " + getListCoreVisual().get(position).getNama(),
                        Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListCoreVisual().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNama, tvPosisi;
        Button btnProfil,btnBagikan;

        public CardViewViewHolder(View itemView) {
            super(itemView);

            imgFoto = (ImageView)itemView.findViewById(R.id.img_item_foto);
            tvNama = (TextView) itemView.findViewById(R.id.tv_item_nama);
            tvPosisi = (TextView) itemView.findViewById(R.id.tv_item_posisi);
            btnProfil = (Button)itemView.findViewById(R.id.btn_set_profil);
            btnBagikan = (Button)itemView.findViewById(R.id.btn_set_bagikan);
        }
    }
}
