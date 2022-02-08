package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

//    TextView nameView = (TextView) findViewById(R.id.textView4);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button  resultbut = (Button) findViewById(R.id.button7);
        Toast.makeText(this,"oncreateofSecondActivity",Toast.LENGTH_SHORT);
        TextView nameView = (TextView) findViewById(R.id.textView4);
        TextView res = (TextView) findViewById(R.id.textView5);
        int count = 0;
        res.setVisibility(View.INVISIBLE);
        String name = getIntent().getStringExtra("name");
        nameView.setText("HELLO "+name);
        Bundle feverb = getIntent().getExtras();
        boolean fever = feverb.getBoolean("fever");
        Bundle rnb = getIntent().getExtras();
        boolean rn = rnb.getBoolean("rn");
        Bundle stb = getIntent().getExtras();
        boolean st = stb.getBoolean("st");
        Bundle bab = getIntent().getExtras();
        boolean ba = bab.getBoolean("ba");
        Bundle hab = getIntent().getExtras();
        boolean ha = hab.getBoolean("ha");

        count += (fever ? 1 : 0);
        count += (rn ? 1 : 0);
        count += (st ? 1 : 0);
        count += (ba ? 1 : 0);
        count += (ha ? 1 : 0);
        String s=String.valueOf(count);
        res.setText(s);

        int finalCount = count;
        resultbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setVisibility(View.VISIBLE);
                resultbut.setVisibility(View.INVISIBLE);

                if (finalCount >=3){
                    res.setText("Results - \nYou have "+s+ " symptoms. So you should get tested."+"\n\n"+" Your symptoms includes - ");
                    if (fever) res.append("You have fever.");
                    if (rn) res.append("\nYou have runny nose.");
                    if (st) res.append("\nYou have sore throat.");
                    if (ba) res.append("\nYou have body ache.");
                    if (ha) res.append("\nYou have head ache.");
                }
                else {
                    res.setText("Results - \nYou have just "+s+ " symptoms. So you should not get tested");
                    if (fever) res.append("\nYou have fever.");
                    if (rn) res.append("\nYou have runny nose.");
                    if (st) res.append("\nYou have sore throat.");
                    if (ba) res.append("\nYou have body ache.");
                    if (ha) res.append("\nYou have head ache.");
                }


            }
        });




    }


    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this,"onstartof2ndActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this,"onresumeof2ndActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this,"onpauseof2ndActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this,"onrestopof2ndActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this,"ondestroyof2ndActivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this,"onstopof2ndActivity",Toast.LENGTH_SHORT).show();
    }
}