package br.com.halph.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Relatorio extends AppCompatActivity {

    private TextView textNome;

    private TextView textValorCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);

        textNome = (TextView) findViewById(R.id.nome);
        textValorCalculo = (TextView) findViewById(R.id.valorCalculo);


        if (getIntent().getExtras() != null) {
            textNome.setText(getIntent().getExtras().getString("nome"));
            textValorCalculo.setText(getIntent().getExtras().getString("valorCalculo"));
        }
    }
}
