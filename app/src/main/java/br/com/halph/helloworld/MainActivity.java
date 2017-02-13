package br.com.halph.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textNome)
    EditText textNome;

    @BindView(R.id.textResultado)
    EditText textResultado;

    @BindView(R.id.checkBoxUm)
    CheckBox checkBoxUm;

    @BindView(R.id.checkBoxDois)
    CheckBox checkBoxDois;

    @BindView(R.id.checkBoxTres)
    CheckBox checkBoxTres;

    @BindView(R.id.radioValorUm)
    RadioButton radioButtonUm;

    @BindView(R.id.radioValorDois)
    RadioButton radioButtonDois;

    @BindView(R.id.textValorUm)
    EditText textValorUm;

    @BindView(R.id.textValorDois)
    EditText textValorDois;

    @BindView(R.id.textResultadoValor)
    EditText textResultadoCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonClick)
    public void helloWorld() {
        String text = "Hello ";
        this.textResultado.setText(text + this.textNome.getText());
    }

    @OnClick(R.id.buttonCalcula)
    public void calcula() {
        int valorUm = Integer.parseInt(textValorUm.getText().toString());
        int valorDois = Integer.parseInt(textValorDois.getText().toString());
        this.textResultadoCalculo.setText(Integer.toString(valorUm + valorDois));
    }

    @OnClick(R.id.btnProximaTela)
    public void trocaTela() {
        Intent intent = new Intent(this, Relatorio.class);
        intent.putExtra("nome", textNome.getText().toString());
        intent.putExtra("valorCalculo", textResultadoCalculo.getText().toString());
        startActivity(intent);
    }
}
