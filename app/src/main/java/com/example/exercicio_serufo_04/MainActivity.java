package com.example.exercicio_serufo_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button botao;
    private RadioButton masculino;
    private RadioButton feminino;
    private EditText txtaltura;
    int [] Imagens = {
            R.drawable.lula,
            R.drawable.manuela};
    private ImageView Imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masculino = findViewById(R.id.masculino);

        feminino = findViewById(R.id.feminino);

        txtaltura = findViewById(R.id.txtaltura);

        botao = findViewById(R.id.botao);

        Imagem = findViewById(R.id.imageView);

        Imagem.setImageResource(Imagens[0]);

        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String tamanho = txtaltura.toString();

                int Alt = Integer.parseInt(tamanho);

                if(masculino.isChecked() == true) {
                    int K = 4;
                    int P;
                    Imagem.setImageResource(Imagens[0]);
                    P = (Alt - 100) - (Alt - 150)/K;

                    Toast.makeText(getBaseContext(),
                            "O Peso ideal é: " + P ,
                            Toast.LENGTH_LONG).show();
                }
                if(feminino.isChecked() == true) {
                    int K = 4;
                    int P;
                    Imagem.setImageResource(Imagens[1]);
                    P = (Alt - 100) - (Alt - 150)/K;

                    Toast.makeText(getBaseContext(),
                            "O Peso ideal é: " + P ,
                            Toast.LENGTH_LONG).show();
                }

                if(masculino.isChecked() == false  && feminino.isChecked() == false || Alt == 0) {

                    Toast.makeText(getBaseContext(),
                            "Sexo não identificado",
                            Toast.LENGTH_LONG).show();
                }



            }
        });



    }
}
