package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtScreen;
    Button btnSomma, btnSottrazione, btnDivisione, btnMoltiplicazione;
    Button btnCancella, btnReset;

    boolean num1 = true;

    int numbers [];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtScreen = findViewById(R.id.txtScreen);
        btnSomma = findViewById(R.id.btnSomma);
        btnSottrazione = findViewById(R.id.btnSottrazione);
        btnDivisione = findViewById(R.id.btnDivisione);
        btnMoltiplicazione = findViewById(R.id.btnMoltiplicazione);
        btnCancella = findViewById(R.id.btnCancella);
        btnReset = findViewById(R.id.btnReset);

        numbers = new int[2];
    }

    public void azione(View v) {
        switch (v.getId()){
            case R.id.btn1:
                txtScreen.setText(txtScreen.getText().toString()+"1");
                break;
            case R.id.btn2:
                txtScreen.setText(txtScreen.getText().toString()+"2");
                break;
            case R.id.btn3:
                txtScreen.setText(txtScreen.getText().toString()+"3");
                break;
            case R.id.btn4:
                txtScreen.setText(txtScreen.getText().toString()+"4");
                break;
            case R.id.btn5:
                txtScreen.setText(txtScreen.getText().toString()+"5");
                break;
            case R.id.btn6:
                txtScreen.setText(txtScreen.getText().toString()+"6");
                break;
            case R.id.btn7:
                txtScreen.setText(txtScreen.getText().toString()+"7");
                break;
            case R.id.btn8:
                txtScreen.setText(txtScreen.getText().toString()+"8");
                break;
            case R.id.btn9:
                txtScreen.setText(txtScreen.getText().toString()+"9");
                break;
            case R.id.btn0:
                txtScreen.setText(txtScreen.getText().toString()+"0");
                break;

            default:
                break;
        }
    }

    public void operatore(View v) {
        int risultato = 0;

        if(num1)
            numbers[0] = Integer.parseInt(txtScreen.getText().toString());
        else
            numbers[1] = Integer.parseInt(txtScreen.getText().toString());

        if(!num1){
            switch (v.getId()){
                case R.id.btnSomma:
                    risultato = numbers[0]+numbers[1];
                    break;
                case R.id.btnSottrazione:
                    risultato = numbers[0]-numbers[1];
                    break;
                case R.id.btnDivisione:
                    risultato = numbers[0]/numbers[1];
                    break;
                case R.id.btnMoltiplicazione:
                    risultato = numbers[0]*numbers[1];
                    break;

                default: break;
            }
        }

        txtScreen.setText(risultato+"");
    }

    public void cancella(View v) {
        String output = "0";

        if(txtScreen.getText().toString() != "0"){
            String attuale = txtScreen.getText().toString();
            output = attuale.substring(0, attuale.length()-1);
        }

        txtScreen.setText(output);
    }

    public void reset(View v) {
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = 0;
    }
}