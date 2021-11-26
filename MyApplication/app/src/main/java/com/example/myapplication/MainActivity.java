package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText myTextBox;
    TextView myOutputBox, sceltaVita;
    Button myButton, buttonSi, buttonNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextBox = findViewById(R.id.inputReceiver);

        myOutputBox = findViewById(R.id.outputBox);
        sceltaVita = findViewById(R.id.sceltaVita);

        myButton = findViewById(R.id.button);
        buttonSi = findViewById(R.id.buttonSi);
        buttonNo = findViewById(R.id.buttonNo);

        Toast toast = Toast.makeText(getApplicationContext(), "Hello toast!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void elabora(View v){
        String stringBase = "Vuoi morire, ";

        buttonSi.setVisibility(View.VISIBLE);
        buttonNo.setVisibility(View.VISIBLE);

        String testo = myTextBox.getText()+"";

        myOutputBox.setText(stringBase+" "+testo+"?");
    }

    public void actionSi(View v){
        buttonNo.setEnabled(false);
        sceltaVita.setText("Sei morto :)");
    }

    public void actionNo(View v){
        buttonSi.setEnabled(false);
        sceltaVita.setText("Sei ancora vivo.. :(");
    }

}