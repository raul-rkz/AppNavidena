package com.androidbolivia.appnavidena;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ToggleButton;

public class Activity__Villancicos extends AppCompatActivity {

    private MediaPlayer mediaPlayer = new MediaPlayer();
    private ToggleButton btnVillanUno,btnVillanDos,btnVillanTres , btnVillanCuatro, btnVillanCinco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity__detalle);

       initUI();

        //createMediaPlayer();

        btnVillanUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnVillanUno.isChecked()) {
                    try {
                        createMediaPlayer(1);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
        btnVillanDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnVillanDos.isChecked()) {
                    try {
                        createMediaPlayer(2);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });

        btnVillanTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnVillanTres.isChecked()) {
                    try {
                        createMediaPlayer(3);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
        btnVillanCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnVillanCuatro.isChecked()) {
                    try {
                        createMediaPlayer(4);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });

        btnVillanCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnVillanCinco.isChecked()) {
                    try {
                        createMediaPlayer(5);
                        mediaPlayer.start();
                        mediaPlayer.setLooping(true);
                    }catch (IllegalStateException e){
                        System.out.println("Error: "+e.getMessage());
                    }
                } else {
                    mediaPlayer.pause();
                    mediaPlayer.setLooping(false);
                }
            }
        });
    }

    public void initUI(){
        btnVillanUno = (ToggleButton)findViewById(R.id.btnVillanUno);
        btnVillanDos = (ToggleButton)findViewById(R.id.btnVillanDos);
        btnVillanTres = (ToggleButton)findViewById(R.id.btnVillanTres);
        btnVillanCuatro = (ToggleButton)findViewById(R.id.btnVillanCuatro);
        btnVillanCinco = (ToggleButton)findViewById(R.id.btnVillanCinco);
    }

        public void createMediaPlayer(int val){
            switch (val){
                case 1:
                    if(mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                    }
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.btnvillanuno);
                    btnVillanDos.setChecked(false);
                    btnVillanTres.setChecked(false);
                    btnVillanCuatro.setChecked(false);
                    btnVillanCinco.setChecked(false);
                    break;
                case 2:
                    if(mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                    }
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.btnvillandos);
                    btnVillanUno.setChecked(false);
                    btnVillanTres.setChecked(false);
                    btnVillanCuatro.setChecked(false);
                    btnVillanCinco.setChecked(false);

                    break;
                case 3:
                    if(mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                    }
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.btnvillantres);
                    btnVillanUno.setChecked(false);
                    btnVillanDos.setChecked(false);
                    btnVillanCuatro.setChecked(false);
                    btnVillanCinco.setChecked(false);

                    break;
                case 4:
                    if(mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                    }
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.btnvillancuatro);
                    btnVillanUno.setChecked(false);
                    btnVillanDos.setChecked(false);
                    btnVillanTres.setChecked(false);
                    btnVillanCinco.setChecked(false);

                    break;
                case 5:
                    if(mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                    }
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.btnvillancinco);
                    btnVillanUno.setChecked(false);
                    btnVillanDos.setChecked(false);
                    btnVillanTres.setChecked(false);
                    btnVillanCuatro.setChecked(false);

                    break;
            }
        }
    }

