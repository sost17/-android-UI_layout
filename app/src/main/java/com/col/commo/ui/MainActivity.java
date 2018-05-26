package com.col.commo.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button abs,fra,lin,rel,tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abs = (Button) findViewById(R.id.button);
        fra = (Button) findViewById(R.id.button4);
        lin = (Button) findViewById(R.id.button5);
        rel = (Button) findViewById(R.id.button2);
        tab = (Button) findViewById(R.id.button3);



        abs.setOnClickListener(this);
        fra.setOnClickListener(this);
        lin.setOnClickListener(this);
        rel.setOnClickListener(this);
        tab.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent = new Intent(MainActivity.this,AbsoluteActivity.class);
                startActivity(intent);
                break;
            case R.id.button4:
                Intent intent1 = new Intent(MainActivity.this,FrameAvtivity.class);
                startActivity(intent1);
                break;
            case R.id.button5:
                Intent intent2 = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(intent2);
                break;
            case R.id.button2:
                Intent intent3 = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent3);
                break;
            case R.id.button3:
                Intent intent4 = new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent4);
                break;

        }
    }
}
