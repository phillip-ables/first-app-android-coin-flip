package com.example.techtron.decider;
import java.util.Random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //i need all my variables
    TextView textView;
    Button btnFate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFate = new Button(this);
        textView = new TextView(this);

        textView = (TextView)findViewById(R.id.textView);
        btnFate = (Button)findViewById(R.id.btn_flip_activity);

        textView.setText(R.string.undecided);
        btnFate.setOnClickListener(this);
    }

    //implement the OnClickListener callback
    public void onClick(View view) {
        //do something
        Random fate = new Random();
        //returns one or zero
        int fatesNumber = fate.nextInt(2);
        if (fatesNumber < 0.5) {
            textView.setText(R.string.head);
            Toast.makeText(getApplicationContext(), "Tails: " + fatesNumber, Toast.LENGTH_SHORT).show();
        } else
        {
            textView.setText(R.string.tails);
            Toast.makeText(getApplicationContext(), "Heads: " + fatesNumber, Toast.LENGTH_SHORT).show();
        }
    }
}
