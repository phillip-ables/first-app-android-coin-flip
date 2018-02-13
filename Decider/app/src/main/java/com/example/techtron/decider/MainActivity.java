package com.example.techtron.decider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnFate = (Button)findViewById(R.id.btn_flip_activity);
        btnFate.setOnClickListener(this);
    }

    //implement the OnClickListener callback
    public void onClick(View view) {
        //do something
        Toast.makeText(getApplicationContext(), "text", Toast.LENGTH_SHORT).show();

    }
}
