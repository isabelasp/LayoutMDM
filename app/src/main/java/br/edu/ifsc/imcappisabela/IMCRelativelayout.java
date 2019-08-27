package br.edu.ifsc.imcappisabela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IMCRelativelayout extends AppCompatActivity {
    EditText edaltura;
    EditText edpeso;
    TextView result;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcrelativelayout);
        EditText edaltura = findViewById(R.id.edAltura);
        EditText edpeso = findViewById(R.id.edPeso);
        TextView result = findViewById(R.id.result);
        button = findViewById(R.id.button11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }

    public void onCalcularIMC(View view){

        double altura = Double.parseDouble(edaltura.getText().toString());
        double peso = Double.parseDouble(edpeso.getText().toString());

        double IMC = peso/(altura*altura);
        result.setText("Resultado "+IMC);

    }

    public void onClicCreditos(View view){

        Intent i = new Intent(this, CreditosActivity.class);
        startActivity(i);

    }
}
