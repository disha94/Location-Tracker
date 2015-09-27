package com.example.locationtracker.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by disha on 25-09-2015.
 */
public class Emp_id extends Activity {

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.emp_id);
            Button btnSubmit;
            btnSubmit=(Button) findViewById(R.id.button1);
            btnSubmit.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Emp_id.this,GPS_Tracker.class));
                }

                });



        }

    }

