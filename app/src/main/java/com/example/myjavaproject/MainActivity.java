package com.example.myjavaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtNamaDepan,txtNamaBelakang;
    TextView txtOutput;
    Button btnTampilankan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNamaDepan =(EditText)findViewById(R.id.txtNamaDepan);
        txtNamaBelakang =(EditText)findViewById(R.id.txtNamaBelakang);
        txtOutput =(TextView) findViewById(R.id.txtOutput);
        btnTampilankan =(Button) findViewById(R.id.btnTampilkan);

        btnTampilankan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nmDepan = txtNamaDepan.getText().toString();
                String nmBelakang = txtNamaBelakang.getText().toString();
                String output = nmDepan+" "+nmBelakang;

                txtOutput.setText(output);
            }
        });



    }
}
