 package com.vsga.proyek2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
    }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu,menu);
        return true;
     }

     @Override
     public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.input_nama) {
            startActivity(new Intent(this, NamaActivity.class));
        }
            if (item.getItemId()==R.id.kalkulator){
                startActivity(new Intent(this, KalkulatorActivity.class));

        }
         if (item.getItemId()==R.id.list_view){
             startActivity(new Intent(this, ListActivity.class));

         }
        return true;
     }

 }