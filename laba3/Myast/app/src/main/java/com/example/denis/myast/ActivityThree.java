package com.example.denis.myast;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityThree extends AppCompatActivity {

          Button btnActThree;
        final String TAG="States";


        public void gotoACT1(View view) {
            Intent intent=new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_three);
            btnActThree=(Button) findViewById(R.id.btnActThree);
            Log.d(TAG, "ActivityThree: onGreate()");

        }
        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d(TAG, "ActivityThree: onRestart()" );
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d(TAG, "ActivityThree: onStart()");
        }


        @Override
        protected void onResume() {
            super.onResume();
            Log.d(TAG, "ActivityThree: onResume()");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d(TAG, "ActivityThree: onPause()");
        }
        @Override
        protected void onStop() {
            super.onStop();
            Log.d(TAG, "ActivityThree: onStop()");
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d(TAG, "ActivityThree: onDestroy()");
        }



    }
