package com.example.comandas_automaticas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Bem Vindo", Toast.LENGTH_LONG).show();

        setContentView(R.layout.activity_main);
        List<String> clientes = new ArrayList<>(
                Arrays.asList("Alex", "Fran", "Jose", "Maria", "Ana"));
        ListView listadeclientes = findViewById(R.id.activity_main_lista_de_clientes);
        listadeclientes.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                clientes));
    }
}


