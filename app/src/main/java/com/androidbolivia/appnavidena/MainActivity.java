package com.androidbolivia.appnavidena;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btncuent);
        btn.setOnClickListener(this);
        btn = (Button) findViewById(R.id.btnvillancicos);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btncuent:
                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.btnvillancicos:
                Intent intent2 = new Intent(this,Main3Activity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }


}
