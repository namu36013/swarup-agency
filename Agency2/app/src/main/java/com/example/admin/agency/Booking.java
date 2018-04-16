package com.example.admin.agency;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Booking extends AppCompatActivity {
    DatabaseHelper db;
    EditText e1,e2,e3,e4;
    Button b1;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_booking );
        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.text4);
        e3=(EditText)findViewById(R.id.Add);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String s1 = e1.getText ( ).toString ( );
                String s2 = e2.getText ( ).toString ( );
                String s3 = e3.getText ( ).toString ( );
                if ( s1.equals ( "" ) || s2.equals ( "" ) ||s3.equals ("")) {
                    Toast.makeText ( getApplicationContext ( ), " fields are empty", Toast.LENGTH_LONG ).show ( );
                } else {
                    Toast.makeText ( getApplicationContext ( ), " bookings are done", Toast.LENGTH_LONG ).show ( );
                }

            }
        });
    }
}

