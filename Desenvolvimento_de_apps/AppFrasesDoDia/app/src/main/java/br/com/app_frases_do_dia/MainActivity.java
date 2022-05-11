package br.com.app_frases_do_dia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(){
        ArrayList<String> frases = new ArrayList<>();
        frases.add("Teria maior confiança no desempenho de um homem que espera ter uma grande recompensa do que no daquele que já a recebeu.");
        frases.add("A maior necessidade deste mundo é de confiança e amor.");
        frases.add("Ter em si próprio uma confiança exagerada é um excelente treino intelectual.");
        frases.add("Se você quiser alguém em quem confiar, confie em si mesmo. Quem acredita sempre alcança.");
        frases.add("A nossa maior ilusão é acreditar que somos o que pensamos ser");

        int numero = new Random().nextInt(frases.size());

        TextView text  = (TextView) findViewById(R.id.frasesGeradas);

        text.setText (frases.get(numero));

    }


}
