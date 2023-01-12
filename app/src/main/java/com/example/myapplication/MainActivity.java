package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;
    Button btn2;
    EditText editTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);

        btn= findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn.setOnClickListener(v->{
            editTxt = findViewById(R.id.editText);
            String szoveg ="Input szöveg: " + editTxt.getText().toString();
            txt.setText(szoveg);
        });

        btn2.setOnClickListener(v->{
            txt.setText("Kettes gomb megnyomva");
        });
    }
}