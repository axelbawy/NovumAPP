package com.example.novum.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.novum.R;

import com.example.novum.R;
import org.w3c.dom.Text;
import java.util.ArrayList;
import java.util.List;


public class ListAdapterCategorias extends ArrayAdapter<Categoria> {



    public ListAdapterCategorias(Context context, ArrayList<Categoria> CategoriaArrayList){
        super(context, R.layout.list_item_cat,CategoriaArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Categoria categoria = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_cat,parent,false);

        }

        TextView nombrecat = convertView.findViewById(R.id.txtNombreCat);
        TextView descripcioncat = convertView.findViewById(R.id.txtDescripcion);

        nombrecat.setText(categoria.getNombre());
        descripcioncat.setText(categoria.getDescripcion());
        return convertView;
    }

}
