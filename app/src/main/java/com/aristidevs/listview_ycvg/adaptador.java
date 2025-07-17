package com.aristidevs.listview_ycvg;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class adaptador extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    String datos[][];

    public adaptador(Context context, String[][] datos){
        this.context = context;
        this.datos = datos;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return datos.length;
    }

    @Override
    public Object getItem(int position){
        return null;
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final View vista = inflater.inflate(R.layout.layout_diseno_ycvg, null);

        TextView nombre = vista.findViewById(R.id.textView2);
        TextView nivel = vista.findViewById(R.id.textView3);
        ImageView imagen = vista.findViewById(R.id.imageView);

        imagen.setImageResource(Integer.valueOf(datos[position][0]));
        nombre.setText(datos[position][1]);
        nivel.setText(datos[position][2]);


        imagen.setTag(position);
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(vista.getContext(), datos[(int)v.getTag()][0], Toast.LENGTH_LONG).show();
            }
        });

        return vista;
    }

}

//(int)v.getTag()























