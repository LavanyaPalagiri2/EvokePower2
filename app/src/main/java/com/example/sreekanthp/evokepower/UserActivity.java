package com.example.sreekanthp.evokepower;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by India on 22-Jan-18.
 */

public class UserActivity  extends AppCompatActivity{
    private TextView tv;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.users);
        tv=(TextView)findViewById(R.id.text1);
        String nameFromIntent=getIntent().getStringExtra("EMAIL");
        tv.setText("welcome"+nameFromIntent);
    }
}
