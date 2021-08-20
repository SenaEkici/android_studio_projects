package com.example.lenovo.rock_paper_scissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class baslangic extends AppCompatActivity implements View.OnClickListener{

    Button b_giris;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baslangic);
        b_giris=(Button)findViewById(R.id.btn_giris);
        b_giris.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(baslangic.this,MainActivity.class);
        startActivity(i);
    }
}
