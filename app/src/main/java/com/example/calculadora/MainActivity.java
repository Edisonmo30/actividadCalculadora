package com.example.calculadora;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText numero1, numero2;
    TextView textResultado;
    Button btnSuma, btnResta, btnDivision, btnMultiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        textResultado = findViewById(R.id.textResultado);

        btnSuma.setOnClickListener(v -> onOperacionClick("1"));

        btnResta.setOnClickListener(v -> onOperacionClick("2"));

        btnMultiplicacion.setOnClickListener(v -> onOperacionClick("3"));

        btnDivision.setOnClickListener(v -> onOperacionClick("4"));

    }
    @SuppressLint("SetTextI18n")
    private void onOperacionClick(String operador) {
        float strval1 = Float.parseFloat(numero1.getText().toString());
        float strval2 = Float.parseFloat(numero2.getText().toString());
        Calculadora calculadora = new Calculadora();

        float resultado = 0;

        switch (operador){
            case "1":
                resultado = calculadora.sumar(strval1, strval2);
                break;
            case "2":
                resultado = calculadora.restar(strval1, strval2);
                break;
            case "3":
                resultado = calculadora.multiplicar(strval1, strval2);
                break;
            case "4":
                if (strval2 != 0) {
                    resultado = calculadora.dividir(strval1, strval2);
                } else {
                    textResultado.setText("Error: División por cero");
                    return;
                }
                break;
        }
        textResultado.setText(String.valueOf(resultado));

    }

}



