package com.vsga.proyek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    private ListView lvItem;
    private String[] namanegara=new String[]{"Indonesia", "Malaysia", "Singapura", "Thailand"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        getSupportActionBar().setTitle("ListView Negara");
        lvItem=findViewById(R.id.list_view);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(ListActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1,namanegara
                );
        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListActivity.this,"Memilih : "+namanegara[i],
                Toast.LENGTH_LONG).show();
            }
        });



    }
}