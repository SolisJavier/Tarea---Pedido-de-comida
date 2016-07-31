package com.facci.cartajs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityJS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_js);
    }
    public void click1(View v){
        Toast.makeText(MainActivityJS.this, "Bandeja de Mariscos", Toast.LENGTH_SHORT).show();
    }
    public void click2(View v){
        Toast.makeText(MainActivityJS.this, "Caldo de Gallina Criolla", Toast.LENGTH_SHORT).show();
    }
    public void click3(View v){
        Toast.makeText(MainActivityJS.this, "Ceviche de Camarones", Toast.LENGTH_SHORT).show();
    }
    public void click4(View v){
        Toast.makeText(MainActivityJS.this, "Corviches", Toast.LENGTH_SHORT).show();
    }
    public void click5(View v){
        Toast.makeText(MainActivityJS.this, "Corvina Apanada", Toast.LENGTH_SHORT).show();
    }
    public void click6(View v){
        Toast.makeText(MainActivityJS.this, "Arroz con Cangrejo", Toast.LENGTH_SHORT).show();
    }
    public void click7(View v){
        Toast.makeText(MainActivityJS.this, "Cazuela de Mariscos", Toast.LENGTH_SHORT).show();
    }
}
