package com.example.magicboll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView cristalimagen;
    private TextView respuesta;

    private String[] respuestasArray = { "Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia imagen
        cristalimagen = findViewById(R.id.cristal);
        //referencia a texto
        respuesta = findViewById(R.id.respuesta);

        cristalimagen.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Buscando tu destino..", Toast.LENGTH_SHORT ).show();
    }
    @Override
    public void onClick(View v){

    //creacion de metodo de respuesta de aleatoria
    switch (v.getId()) {
        case R.id.cristal:
            int random = new Random().nextInt(respuestasArray.length);
            respuesta.setText(respuestasArray[random]);

            break;
    }
    }
}
