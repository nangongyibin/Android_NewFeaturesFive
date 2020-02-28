package com.ngyb.newfeaturesfive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MaterialDesign(View view) {
        Intent intent = new Intent(this, MaterialDesignActivity.class);
        startActivity(intent);
    }

    public void action(View view) {
        Intent intent = new Intent(this, ActionActivity.class);
        startActivity(intent);
    }

    public void style(View view) {
        Intent intent = new Intent(this, StyleActivity.class);
        startActivity(intent);
    }

    public void module(View view) {
        Intent intent = new Intent(this, ModuleActivity.class);
        startActivity(intent);
    }

}
