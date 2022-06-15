package com.bohdan.housingsearch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bohdan.housingsearch.cities.MainActivity2;

public class MainActivity1 extends Activity implements View.OnClickListener {

    TextView tv2;
    Button button2;
    EditText name;
    ImageView imageView7, imageView4;
    String s1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        tv2 = (TextView) findViewById(R.id.tv2);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        name = (EditText) findViewById(R.id.name);
    }

    @Override
    public void onClick(View view) {
        s1 = name.getText().toString();
        Intent anIntent;
        anIntent = new Intent(this, MainActivity2.class);
        anIntent.putExtra("name", s1);
        startActivity(anIntent);
    }
}

