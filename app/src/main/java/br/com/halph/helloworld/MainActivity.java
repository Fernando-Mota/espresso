package br.com.halph.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText textNome;

    private EditText textResultado;

    private CheckBox checkBoxUm;

    private CheckBox checkBoxDois;

    private CheckBox checkBoxTres;

    private RadioButton radioButtonUm;

    private RadioButton radioButtonDois;

    private EditText textValorUm;

    private EditText textValorDois;

    private EditText textResultadoCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickButton = (Button) findViewById(R.id.buttonClick);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                helloWorld();
            }
        });

        Button buttonCalcula = (Button) findViewById(R.id.buttonCalcula);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                calcula();
            }
        });


        this.textNome = (EditText) findViewById(R.id.textNome);
        this.textResultado = (EditText) findViewById(R.id.textResultado);
        this.checkBoxUm = (CheckBox) findViewById(R.id.checkBoxUm);
        this.checkBoxDois = (CheckBox) findViewById(R.id.checkBoxDois);
        this.checkBoxTres = (CheckBox) findViewById(R.id.checkBoxTres);
        this.radioButtonUm = (RadioButton) findViewById(R.id.radioValorUm);
        this.radioButtonDois = (RadioButton) findViewById(R.id.radioValorDois);
        this.textValorUm = (EditText) findViewById(R.id.textValorUm);
        this.textValorDois = (EditText) findViewById(R.id.textValorDois);
        this.textResultadoCalculo = (EditText) findViewById(R.id.textResultadoValor);
    }

    public void helloWorld() {
        String text = "Hello ";
        this.textResultado.setText(text + this.textNome.getText());
    }

    public void calcula() {
        int valorUm = Integer.parseInt(textValorUm.getText().toString());
        int valorDois = Integer.parseInt(textValorDois.getText().toString());
        this.textResultadoCalculo.setText(valorUm + valorDois);
    }



}
