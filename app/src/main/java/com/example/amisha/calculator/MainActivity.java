package com.example.amisha.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    TextView t;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);


        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           s="0";
            t.setText("+s");

            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="1";
                t.setText("+s");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s="2";
                t.setText("+s");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               s="3";
                t.setText("+s");
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="4";
                t.setText("+s");
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="5";
                t.setText("+s");
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="6";
                t.setText("+s");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="7";
                t.setText("+s");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="8";
                t.setText("+s");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               s="9";
                t.setText("+s");
            }
        });


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             s="-";
                t.setText("-");
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="+";
                t.setText("+");
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="/";
                t.setText("/");
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s="*";
                t.setText("*");
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t.setText("");
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t.setText("/b");
            }
        });
    }
}
