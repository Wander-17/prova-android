package com.example.numeromagico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtIstruzioni, txtResult;
    Button btnNewNumber, btnInsert;
    EditText edtNumber;

    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIstruzioni = findViewById(R.id.txtIstruzioni);
        txtResult = findViewById(R.id.txtResult);
        btnNewNumber = findViewById(R.id.btnNewNumber);
        btnInsert = findViewById(R.id.btnInsert);
        edtNumber = findViewById(R.id.edtNumber);

        generateNumber();
        txtIstruzioni.setText(""+randomNumber);
        // txtIstruzioni.setText("Indovina il numero! \nIl numero può essere tra 1 e 100, buona fortuna!");
    }

    public void generateNumber(View v) {
        randomNumber = (int)(Math.random()*101)+1;
    }

    public void generateNumber() {
        randomNumber = (int)(Math.random()*101)+1;
    }

    public void checkNumber(View v) {
        if(edtNumber.getText().toString().equals("")) {
            txtResult.setText("Inserisci un numero, birbante");
        }
        else {
            int inputUtente = Integer.parseInt(edtNumber.getText().toString());


            if(inputUtente < 0 || inputUtente > 100){
                txtResult.setText("Il numero deve essere tra 1 e 100!!!");
            }
            else if(inputUtente == randomNumber) {
                txtResult.setText("Congratulazioni");
            }
            else if(inputUtente > randomNumber) {
                if (inputUtente - randomNumber < 10){
                    txtResult.setText("Grande ma ci sei vicino..");
                }
                else
                    txtResult.setText("Try again.. xe troppo grande");
            }
            else if(inputUtente < randomNumber) {
                if (randomNumber - inputUtente < 10){
                    txtResult.setText("Piccolo ma ci sei vicino..");
                }
                else
                    txtResult.setText("Try again.. xe troppo piccolo");
            }
        }
    }


}