package com.vsga.proyek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NamaActivity extends AppCompatActivity {
    private char input1;
    private EditText editNama;
    private TextView hasilText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);
        getSupportActionBar().setTitle("Input Nama");

        editNama=(EditText)findViewById(R.id.editTextNama);
        hasilText=(TextView) findViewById(R.id.hasilNama);
    }

    public void tampilNama(View view) {
        hasilText.setText(editNama.getText());
    }

}