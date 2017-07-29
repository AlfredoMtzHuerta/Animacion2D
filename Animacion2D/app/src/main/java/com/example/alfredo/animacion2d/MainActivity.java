package com.example.alfredo.animacion2d;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText texto;
    private Button enviarDato, enviarTodo;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         texto = (EditText) findViewById(R.id.edTexto);
         texto.setVisibility(View.INVISIBLE);
         enviarDato = (Button) findViewById(R.id.btnEnviar);
         enviarDato.setVisibility(View.INVISIBLE);
         enviarTodo = (Button) findViewById(R.id.btnEnviarTodo);
         enviarTodo.setVisibility(View.INVISIBLE);
    }

    public void onClick1(View v) {
        Intent i1 = new Intent(this,Circulo.class);
        startActivity(i1);
    }

    public void OnClickLinea(View v)
    {
        Intent i = new Intent(this, Linea.class);
        startActivity(i);
    }

    public void Ovalo(View v)
    {
        Intent i2 = new Intent(this, Ovalo.class);
        startActivity(i2);
    }

    public void Rectangulo(View v)
    {
        Intent i = new Intent(this, Rectangulo.class);
        startActivity(i);
    }

    public void Texto(View v)
    {
        texto.setVisibility(View.VISIBLE);
        enviarDato.setVisibility(View.VISIBLE);
        enviarTodo.setVisibility(View.INVISIBLE);
    }

    public void EnviarTexto(View v)
    {
        Intent i4 = new Intent(this, Texto.class);
        i4.putExtra("texto", texto.getText().toString());
        startActivity(i4);
    }

    public void TextoBotonVisible(View v)
    {
        texto.setVisibility(View.VISIBLE);
        enviarTodo.setVisibility(View.VISIBLE);
        enviarDato.setVisibility(View.INVISIBLE);
    }

    public void EnviarTodo(View v)
    {
        Intent i = new Intent(this, Todos.class);
        i.putExtra("texto", texto.getText().toString());
        startActivity(i);
    }

}