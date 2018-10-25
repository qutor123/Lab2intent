package com.example.taruc.lab2intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String stringMsg;
        TextView textViewMsg = findViewById(R.id.textViewMessage);
        //Create and instance of the Intent
        Intent intent = getIntent(); //Who called me ?
        if(intent.hasExtra(MainActivity.Message_TAG)){
            stringMsg = intent.getStringExtra(MainActivity.Message_TAG);
            //int age = intent.getIntExtra("TAG_AGE", defaultValue:0)
            textViewMsg.setText(stringMsg);
        }


        public void sendReply(View view){
            EditText editTextReply;
            editTextReply = findViewById(R.id.editTextReply);
            if(TextUtils.setError(getString(R.string.error_reply))){
                return;
            }
            String stiringReply = editTextReply.getText().toString();
            //Create an instance of the Intent
            Intent intent = new Intent();
            //Pass calue to itnent
            intent.putExtra(REPLY_TAG, stringReply);
            //Set result to OK
            setResult(RESULT_OK, intent);
            finish();




        }


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
