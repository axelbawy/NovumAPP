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


public class ListAdapterSubcategoria extends ArrayAdapter<Subcategoria> {
    public ListAdapterSubcategoria(Context context, ArrayList<Subcategoria> SubcategoriaArrayList){

        super(context, R.layout.list_item_prod,SubcategoriaArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String URL_INTERNET;
        Subcategoria subcategoria = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_subcat,parent,false);

        }


        TextView nomsubcat = convertView.findViewById(R.id.txtNombreSub);




        /*URL_INTERNET=subcategoria.getFoto().toString();
        Picasso.get().load(URL_INTERNET).into(imageView);*/
        nomsubcat.setText(subcategoria.getNombreSubcategoria().toString());
        return convertView;
    }
}
