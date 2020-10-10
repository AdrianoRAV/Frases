package com.mora.frasesparadia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {

                "Frases1",
                "Frases2",
                "Frases3",
                "Frases4",
                "Frases5",

        };
        int numero = new Random().nextInt(5);//0 1 2 3 4 5

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }

}