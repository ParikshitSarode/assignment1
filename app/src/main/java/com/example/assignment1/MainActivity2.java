package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

//    TextView nameView = (TextView) findViewById(R.id.textView4);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nameView = (TextView) findViewById(R.id.textView4);
        TextView res = (TextView) findViewById(R.id.textView5);
        int count = 0;
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

        if (count>=3){
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
}