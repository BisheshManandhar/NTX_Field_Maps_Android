package com.something.bishe.ntx_field_maps_android;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonWisemen = (Button)findViewById(R.id.bobWisemen);
        Button buttonCarpenter = (Button)findViewById(R.id.carpenter);
        Button buttonChinn = (Button)findViewById(R.id.chinnchapel);
        Button buttonMcinnish = (Button)findViewById(R.id.mcInnish);
        Button buttonMoneygram = (Button)findViewById(R.id.moneyGram);
        Button buttonRichland = (Button)findViewById(R.id.richland);
        Button buttonRussellCreek = (Button)findViewById(R.id.russellCreek);
        Button buttonFivestar = (Button)findViewById(R.id.colony);
        Button buttonPitplus = (Button)findViewById(R.id.pitPlus);
        Button buttonRailroad = (Button)findViewById(R.id.railroad);
        Button buttonFcdallas = (Button)findViewById(R.id.fcDallas);
        Button buttonUtdallas = (Button)findViewById(R.id.utDallas);

        buttonWisemen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(MainActivity.this, wisemen.class);
                startActivity(int1);
            }
        });

        buttonCarpenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this, carpenter.class);
                startActivity(int2);
            }
        });

        buttonChinn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this, chinnchapel.class);
                startActivity(int3);
            }
        });

        buttonMcinnish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(MainActivity.this, mcInnish.class);
                startActivity(int4);
            }
        });

        buttonMoneygram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(MainActivity.this, moneygram.class);
                startActivity(int5);
            }
        });

        buttonRichland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(MainActivity.this, richland.class);
                startActivity(int6);
            }
        });

        buttonRussellCreek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(MainActivity.this, russellcreek.class);
                startActivity(int7);
            }
        });

        buttonFivestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(MainActivity.this, fivestar.class);
                startActivity(int8);
            }
        });

        buttonPitplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9 = new Intent(MainActivity.this, pitplus.class);
                startActivity(int9);
            }
        });

        buttonRailroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10 = new Intent(MainActivity.this, railroad.class);
                startActivity(int10);
            }
        });

        buttonFcdallas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11 = new Intent(MainActivity.this, fcdallas.class);
                startActivity(int11);
            }
        });

        buttonUtdallas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12 = new Intent(MainActivity.this, utdallas.class);
                startActivity(int12);
            }
        });

    }

}


