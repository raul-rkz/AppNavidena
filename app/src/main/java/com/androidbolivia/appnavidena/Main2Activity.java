package com.androidbolivia.appnavidena;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        classCuentos classCuentos_datos[] =new classCuentos[]{

                new classCuentos(R.drawable.dos,"La Navidad de Romina"),
                new classCuentos(R.drawable.tres,"La Ventana"),
                new classCuentos(R.drawable.cuatro,"Hochi el Reno"),
                new classCuentos(R.drawable.cinco,"Santa Secreto"),
                new classCuentos(R.drawable.seis,"Los Duendes de la Navidad"),
                new classCuentos(R.drawable.siete,"Alicia"),
                new classCuentos(R.drawable.ocho,"Navidad a la fuerza"),
                new classCuentos(R.drawable.nueve,"La Última Navidad de Sofía"),
        };
        CuentosAdapter adapter = new CuentosAdapter(this, R.layout.listview_item, classCuentos_datos );

        listView =(ListView) findViewById(R.id.listview);

        View header = (View) getLayoutInflater().inflate(R.layout.listview_item, null);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView v = (TextView)view.findViewById(R.id.tv);
                //Toast.makeText(getApplicationContext(),v.getText(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),CuartaActivity.class);
                String v1 = v.toString();
                if(v.getText().equals("El Árbol de Navidad")){
                    intent.putExtra("DATO",1);
                    startActivity(intent);
                }
                if(v.getText().equals("La Navidad de Romina")){
                    intent.putExtra("DATO",2);
                    startActivity(intent);
                }
                if(v.getText().equals("La Ventana")){
                    intent.putExtra("DATO",3);
                    startActivity(intent);
                }
                if(v.getText().equals("Hochi el Reno")){
                    intent.putExtra("DATO",4);
                    startActivity(intent);
                }
                if(v.getText().equals("Santa Secreto")){
                    intent.putExtra("DATO",5);
                    startActivity(intent);
                }
                if(v.getText().equals("Los Duendes de la Navidad")){
                    intent.putExtra("DATO",6);
                    startActivity(intent);
                }
                if(v.getText().equals("Alicia")){
                    intent.putExtra("DATO",7);
                    startActivity(intent);
                }
                if(v.getText().equals("Navidad a la fuerza")){
                    intent.putExtra("DATO",8);
                    startActivity(intent);
                }
                if(v.getText().equals("La Última Navidad de Sofía")){
                    intent.putExtra("DATO",9);
                    startActivity(intent);
                }
                startActivity(intent);
            }
        });

    }
}
