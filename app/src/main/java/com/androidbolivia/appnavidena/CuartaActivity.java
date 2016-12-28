package com.androidbolivia.appnavidena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CuartaActivity extends AppCompatActivity {
    TextView tv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta);
        tv = (TextView) findViewById(R.id.texto1);
        Intent i = getIntent();
        Bundle extra = i.getExtras();
        int dato = extra.getInt("DATO");
        if(dato==1){
            tv.setText(R.string.Contenido1);
        }
        if(dato==2){
            tv.setText(R.string.Contenido2);
        }
        if(dato==3){
            tv.setText(R.string.Contenido3);
        }
        if(dato==4){
            tv.setText(R.string.Contenido4);
        }
        if(dato==5){
            tv.setText(R.string.Contenido5);
        }
        if(dato==6){
            tv.setText(R.string.Contenido6);
        }
        if(dato==7){
            tv.setText(R.string.Contenido7);
        }
        if(dato==8){
            tv.setText(R.string.Contenido8);
        }
        if(dato==9){
            tv.setText(R.string.Contenido9);
        }


    }
}
