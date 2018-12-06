package com.qifuataufiqs.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardViewCorehaqAdapter {

    private ArrayList<CoreVisual> listCoreVisual;
    private Context context;

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
