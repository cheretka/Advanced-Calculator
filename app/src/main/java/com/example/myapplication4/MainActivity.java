package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fun_simple(View view) {
        Intent myIntent = new Intent(view.getContext(), Simple.class);
        startActivityForResult(myIntent, 0);
    }

    public void fun_advanced(View view) {
        Intent myIntent = new Intent(view.getContext(), Advanced.class);
        startActivityForResult(myIntent, 0);
    }

    public void fun_about(View view) {
        Intent myIntent = new Intent(view.getContext(), About.class);
        startActivityForResult(myIntent, 0);
    }

    public void fun_exit(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}