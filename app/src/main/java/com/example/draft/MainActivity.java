package com.example.draft;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstSem=new Intent(MainActivity.this,first_sem.class);
                startActivity(firstSem);

            }
        });
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondSem=new Intent(MainActivity.this, com.example.draft.second_sem.class);
                startActivity(secondSem);

            }
        });
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdSem=new Intent(MainActivity.this, com.example.draft.third_sem.class);
                startActivity(thirdSem);
            }
        });
        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fourthsem=new Intent(MainActivity.this, com.example.draft.fourth_sem.class);
                startActivity(fourthsem);
            }
        });
        button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fifthsem=new Intent(MainActivity.this, com.example.draft.fifth_sem.class);
                startActivity(fifthsem);
            }
        });
        button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sixthsem=new Intent(MainActivity.this, com.example.draft.sixth_sem.class);
                startActivity(sixthsem);
            }
        });
        button7=findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sevensem=new Intent(MainActivity.this, com.example.draft.seven_sem.class);
                startActivity(sevensem);
            }
        });
        button8=findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eightsem=new Intent(MainActivity.this, com.example.draft.eight_sem.class);
                startActivity(eightsem);
            }
        });
    }
}