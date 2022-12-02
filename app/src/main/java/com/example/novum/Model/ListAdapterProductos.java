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
import com.squareup.picasso.Picasso;

import com.example.novum.R;

import java.util.ArrayList;


public class ListAdapterProductos extends ArrayAdapter<Producto> {



    public ListAdapterProductos(Context context, ArrayList<Producto> ProductoArrayList){

        super(context, R.layout.list_item_prod,ProductoArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String URL_INTERNET;
        Producto producto = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_prod,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.imagenProducto);
        TextView nombreprod = convertView.findViewById(R.id.txtNombreSub);
        TextView stock = convertView.findViewById(R.id.txtStock);
        Button favoritos = convertView.findViewById(R.id.btn_Fav);


        URL_INTERNET=producto.getFoto().toString();
        Picasso.get().load(URL_INTERNET).into(imageView);
        nombreprod.setText(producto.getNombre());
        stock.setText(producto.getStock().toString());
        return convertView;
    }

}
