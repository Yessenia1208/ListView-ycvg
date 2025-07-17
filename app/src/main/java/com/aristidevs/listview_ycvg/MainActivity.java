package com.aristidevs.listview_ycvg;

import androidx.core.graphics.Insets;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String[][] datos = {
                {String.valueOf(R.drawable.ic_launcher_foreground), "juan", "nivel1"},
                {String.valueOf(R.drawable.ic_launcher_foreground), "juan1", "nivel3"},
                {String.valueOf(R.drawable.ic_launcher_foreground), "juan2", "nivel4"}
        };

        ListView lista;
        lista = findViewById(R.id.opciones);
        lista.setAdapter(new adaptador(this, datos));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String seleccionado = parent.getItemAtPosition(position).toString();
        tv.setText(" " + seleccionado);
    }
}
