package com.teresa.android.flowershop;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void openRedActivity(View view) {
        Intent i = new Intent(this, RedActivity.class);
        startActivity(i);
    }

    public void openPurpleActivity(View view) {
        Intent i = new Intent(this, PurpleActivity.class);
        startActivity(i);
    }

    public void openWhiteActivity(View view) {
        Intent i = new Intent(this, WhiteActivity.class);
        startActivity(i);
    }
    public void openYellowActivity(View view) {
        Intent i = new Intent(this,YellowActivity.class);
        startActivity(i);
    }
}
