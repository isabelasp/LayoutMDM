package br.edu.ifsc.imcappisabela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class IMCRelativelayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcrelativelayout);
    }

    public void onCalcularIMC(View view){

        EditText edaltura = findViewById(R.id.edAltura);
        EditText edpeso = findViewById(R.id.edPeso);

        double altura = Double.parseDouble(edaltura.getText().toString());
        double peso = Double.parseDouble(edpeso.getText().toString());

        TextView result = findViewById(R.id.result);
        double IMC = peso/(altura*altura);
        result.setText("Resultado "+IMC);

    }

    public void onClicCreditos(View view){

        Intent i = new Intent(this, CreditosActivity.class);
        startActivity(i);

    }
}
