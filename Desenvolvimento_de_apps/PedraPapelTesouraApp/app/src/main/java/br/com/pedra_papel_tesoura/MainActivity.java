package br.com.pedra_papel_tesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ImageView cpuResults = (ImageView) findViewById(R.id.imagemResultado);
    TextView textResultado = (TextView) findViewById(R.id.resultado);

    public boolean verifyWinnerUser(String cpu, String user){
        return cpu.equals("pedra") && user.equals("papel") ||
                cpu.equals("papel") && user.equals("tesoura") ||
                cpu.equals("tesoura") && user.equals("pedra");
    }

    public boolean verifyWinnerCpu(String cpu, String user){
        return cpu.equals("papel") && user.equals("pedra") ||
                cpu.equals("tesoura") && user.equals("papel") ||
                cpu.equals("pedra") && user.equals("tesoura");
    }


    public void opcaoSelecionada(String userChoice){
        String [] arrayChoices = {"pedra", "papel", "tesoura"};
        int options  = new Random().nextInt(3);
        String cpuOptions = arrayChoices[options];
        switch (cpuOptions){
            case "pedra":
              cpuResults.setImageResource(R.drawable.pedra);
              break;
            case "papel":
                cpuResults.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                cpuResults.setImageResource(R.drawable.tesoura);
                break;
        }
        if(verifyWinnerUser(cpuOptions, userChoice)){
            textResultado.setText("User WINS");
        }
        else if (verifyWinnerCpu(cpuOptions, userChoice)){
            textResultado.setText("CPU WINS");
        }
        else{
            textResultado.setText("EMPATOU");
        }

    }

    public void selectRock(View view){
        opcaoSelecionada("pedra");
    }

    public void selectPaper(View view){
        opcaoSelecionada("papel");
    }

    public void selectScissors(View view){
      opcaoSelecionada("tesoura");
    }





}
