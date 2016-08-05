package com.example.cosain.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Output extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView view = (TextView) findViewById(R.id.text);
        TextView view1 = (TextView) findViewById(R.id.text2);

        Intent a = getIntent();
        Bundle bundle = a.getExtras();

        if(bundle != null){
            String w = (String) bundle.get("pota");
            String q = (String) bundle.get("neat");
            view.setText(q);
            view1.setText(w);
        }


    }

}
