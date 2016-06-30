package com.mac.training.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
EditText tT1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tT1 = (EditText) findViewById(R.id.name);

        Intent  i = getIntent();
        tT1.setText(i.getStringExtra("T1"));
    }

    public void onGoBack(View view) {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("myOwnKey", tT1.getText().toString());
        setResult(RESULT_OK, i);

        finish();
    }
}
