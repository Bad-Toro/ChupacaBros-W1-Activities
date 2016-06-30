package com.mac.training.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String aString;
    EditText eT;
    EditText eT2;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("lonely", aString);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        aString = savedInstanceState.getString("lonely","Lonely");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eT = (EditText) findViewById(R.id.t1);
        eT2 = (EditText) findViewById(R.id.t2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 747){
            if(resultCode == RESULT_OK){
                eT2.setText(data.getStringExtra("myOwnKey"));
            }
        }

    }

    public void onGo22(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("T1",eT.getText().toString());
        startActivityForResult(i, 747);
    }
}
