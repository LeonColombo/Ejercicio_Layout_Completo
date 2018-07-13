package com.example.itmaster.ejercicio_layout_completo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button peli1,peli2,peli3,peli4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peli1 = findViewById(R.id.peli1);
        peli2 = findViewById(R.id.peli2);
        peli3 = findViewById(R.id.peli3);
        peli4 = findViewById(R.id.peli4);


        peli1.setText("Hello MF");
        peli2.setText("DESCARGAR");
        peli3.setText("WTF");
        peli2.setText("F$$% YOU");
        

    }




    }
}
