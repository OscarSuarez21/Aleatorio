package com.example.aleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public  class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private EditText numeroTxt;
    private Button btngenerar;
    private TextView resultTxt;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroTxt = (EditText) findViewById(R.id.numeroTxt);
        btngenerar = (Button) findViewById(R.id.btngenerar);
        resultTxt = (TextView) findViewById(R.id.resultTxt);
        btngenerar.setOnClickListener(this);
    }
            @Override
            public void onClick(View view) {

                if (btngenerar == view) {
                    Random r = new Random();
                    int resultado;
                    String taks = numeroTxt.getText().toString();
                    resultado = Integer.parseInt(taks);
                    int va = Integer.parseInt(taks);
                    for (int i = 0; i < va; i = resultado) {
                        int random = r.nextInt(resultado) + 1;
                        System.out.println(random);
                        String randoString = Integer.toString(random);
                        resultTxt.setText(randoString);

                    }

                }
            }
}