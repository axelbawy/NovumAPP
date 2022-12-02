package com.example.novum.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.novum.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListAdapterFavorito extends ArrayAdapter<Favorito> {
    public ListAdapterFavorito(Context context, ArrayList<Favorito> FavoritoArrayList){

        super(context, R.layout.list_item_fav,FavoritoArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String URL_INTERNET;
        Favorito favorito = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_prod,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.imagenProducto);
        TextView nombreprod = convertView.findViewById(R.id.txtNombreSub);
        TextView stock = convertView.findViewById(R.id.txtStock);
        Button favoritos = convertView.findViewById(R.id.btn_Fav);


        //URL_INTERNET=favorito.getFoto().toString();
        //Picasso.get().load(URL_INTERNET).into(imageView);
        nombreprod.setText(favorito.getId_favoritos().toString());
        //stock.setText(favorito.getStock().toString());
        return convertView;

    }
}
