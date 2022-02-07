package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button okbut, next1,next2,next3,next4,submit,clear;
    Switch swt1,swt2,swt3,swt4,swt5;
    boolean fever,rn,st,ba,ha;
    TextView name;
    LinearLayout ques,head,symp1,symp2,symp3,symp4,symp5;
    EditText entername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next1 = (Button) findViewById(R.id.button);
        next2 = (Button)findViewById(R.id.button2);
        next3 = (Button)findViewById(R.id.button3);
        next4 = (Button)findViewById(R.id.button4);
        submit = (Button)findViewById(R.id.button5);
        clear = (Button)findViewById(R.id.button14);
        okbut = (Button)findViewById(R.id.button9);
        swt1 = (Switch) findViewById(R.id.switch1);
        swt2 = (Switch) findViewById(R.id.switch2);
        swt3 = (Switch) findViewById(R.id.switch3);
        swt4 = (Switch) findViewById(R.id.switch4);
        swt5 = (Switch) findViewById(R.id.switch5);
        ques = findViewById(R.id.ques);
        head =  findViewById(R.id.head);
        symp1 = findViewById(R.id.sym1);
        symp2 = findViewById(R.id.sym2);
        symp3 = findViewById(R.id.sym3);
        symp4 = findViewById(R.id.sym4);
        symp5 = findViewById(R.id.sym5);

        name = (TextView) findViewById(R.id.textView3);
        entername = (EditText) findViewById(R.id.editname);

        okbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = String.valueOf(entername.getText().toString());
                if (username.length()>0) {
                    name.setText("Hello " + username);
                    head.setVisibility(View.INVISIBLE);
                    ques.setVisibility(View.VISIBLE);
                    symp1.setVisibility(View.VISIBLE);
//                    symp2.setVisibility(View.VISIBLE);
//                    symp3.setVisibility(View.VISIBLE);
//                    symp4.setVisibility(View.VISIBLE);
//                    symp5.setVisibility(View.VISIBLE);
                }else name.setText("Enter valid name again");
            }
        });

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next1.setText("saved");
                fever = swt1.isChecked();
                symp2.setVisibility(View.VISIBLE);
                next1.setEnabled(false);
                swt1.setEnabled(false);

            }
        });
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next2.setText("saved");
                rn = swt2.isChecked();
                symp3.setVisibility(View.VISIBLE);
                next2.setEnabled(false);
                swt2.setEnabled(false);
            }
        });
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next3.setText("saved");
                st = swt3.isChecked();
                symp4.setVisibility(View.VISIBLE);
                next3.setEnabled(false);
                swt3.setEnabled(false);
            }
        });
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next4.setText("saved");
                symp5.setVisibility(View.VISIBLE);
                next4.setEnabled(false);
                ba=swt4.isChecked();
                swt4.setEnabled(false);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit.setText("saved");
                symp5.setVisibility(View.VISIBLE);
                ha=swt5.isChecked();
                submit.setEnabled(false);
                swt5.setEnabled(false);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit.setText("Submit");
                submit.setEnabled(true);
                swt5.setEnabled(true);
                swt5.setChecked(false);
                symp5.setVisibility(View.INVISIBLE);

                next1.setText("Next");
                next1.setEnabled(true);
                swt1.setEnabled(true);
                swt1.setChecked(false);
                symp1.setVisibility(View.INVISIBLE);

                next2.setText("Next");
                next2.setEnabled(true);
                swt2.setEnabled(true);
                swt2.setChecked(false);
                symp2.setVisibility(View.INVISIBLE);

                next3.setText("Next");
                next3.setEnabled(true);
                swt3.setEnabled(true);
                swt3.setChecked(false);
                symp3.setVisibility(View.INVISIBLE);

                next4.setText("Next");
                next4.setEnabled(true);
                swt4.setEnabled(true);
                swt4.setChecked(false);
                symp4.setVisibility(View.INVISIBLE);

                name.setText("ENTER NAME BELOW ");
                head.setVisibility(View.VISIBLE);
                ques.setVisibility(View.INVISIBLE);

                entername.setText("");
            }
        });


    }
}