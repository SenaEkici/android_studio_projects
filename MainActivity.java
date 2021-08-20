package com.example.lenovo.rock_paper_scissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b_rock,b_paper,b_scissor;
    ImageView img_pc,img_user;
    String mychoice,pcchoice;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=getIntent();
        img_pc=(ImageView) findViewById(R.id.img_pc);
        img_user=(ImageView) findViewById(R.id.img_user);
        b_paper=(Button) findViewById(R.id.b_paper);
        b_rock=(Button) findViewById(R.id.b_rock);
        b_scissor=(Button) findViewById(R.id.b_scissors);
        b_paper.setOnClickListener(this);
        b_rock.setOnClickListener(this);
        b_scissor.setOnClickListener(this);
        rnd=new Random();
    }

    @Override
    public void onClick(View view) {
        if (view.equals(b_paper)){
            mychoice="paper";
            img_user.setImageResource(R.drawable.paper);
            kimkazandi();
        }
        if (view.equals(b_rock)){
            mychoice="rock";
            img_user.setImageResource(R.drawable.rock);
            kimkazandi();

        }
        if (view.equals(b_scissor)){
            mychoice="scissors";
            img_user.setImageResource(R.drawable.scissor);
            kimkazandi();

        }
    }

    public void kimkazandi(){
        int pc=rnd.nextInt(3);
        if (pc==0){
            pcchoice="rock";
            img_pc.setImageResource(R.drawable.rock);
        }else  if(pc==1){
            pcchoice="paper";
            img_pc.setImageResource(R.drawable.paper);
        }else if (pc==2){
            img_pc.setImageResource(R.drawable.scissor);
            pcchoice="scissors";
        }
        if (mychoice.equals("rock") && pcchoice.equals("paper")){
            Toast.makeText(getApplicationContext(),"Kaybettin",Toast.LENGTH_LONG).show();
        }
        else if (mychoice.equals("rock") && pcchoice.equals("scissors")){
            Toast.makeText(getApplicationContext(),"Kazandın",Toast.LENGTH_LONG).show();
        }
        else if (mychoice.equals("paper") && pcchoice.equals("rock")){
            Toast.makeText(getApplicationContext(),"Kazandın",Toast.LENGTH_LONG).show();
        }
        else if (mychoice.equals("paper") && pcchoice.equals("scissors")){
            Toast.makeText(getApplicationContext(),"Kaybettin",Toast.LENGTH_LONG).show();
        }
        else if (mychoice.equals("scissors") && pcchoice.equals("paper")){
            Toast.makeText(getApplicationContext(),"Kazandın",Toast.LENGTH_LONG).show();
        }
        else if (mychoice.equals("scissors") && pcchoice.equals("rock")){
            Toast.makeText(getApplicationContext(),"Kaybettin",Toast.LENGTH_LONG).show();
        }
        else if (mychoice.equals("scissors") && pcchoice.equals("scissors")){
            Toast.makeText(getApplicationContext(),"Berabere",Toast.LENGTH_LONG).show();
        }
        else if (mychoice.equals("paper") && pcchoice.equals("paper")){
            Toast.makeText(getApplicationContext(),"Berabere",Toast.LENGTH_LONG).show();
        }
        else if (mychoice.equals("rock") && pcchoice.equals("rock")){
            Toast.makeText(getApplicationContext(),"Berabere",Toast.LENGTH_LONG).show();
        }
    }

}
