package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //métodos para evento de clique do usuário em pedra, papel ou tesoura:
    public void selecionarPedra( View view){
        verificarGanhador("pedra");
    }

    public void selecionarPapel( View view){
        verificarGanhador("papel");
    }

    public void selecionarTesoura( View view){
        verificarGanhador("Tesoura");
    }

    private void verificarGanhador( String escolhaUsuario){
        System.out.println("Item clicado: " + escolhaUsuario);
    }

}