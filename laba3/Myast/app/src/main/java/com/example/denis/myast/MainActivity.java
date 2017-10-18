package com.example.denis.myast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnActTwo;
    final String TAG="States";


    public void gotoACT2(View view) {
        Intent intent=new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActTwo=(Button) findViewById(R.id.btnActTwo);
        Log.d(TAG, "MainAcivity: onGreate()");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainAcivity: onRestart()" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainAcivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainAcivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainAcivity: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainAcivity: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainAcivity: onDestroy()");
    }

}



