package com.example.taruc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String Message_TAG = "com.example.taruc.lab2intent";
    private static final int REQUEST_CODE = 1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main","onPause");

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void sendMessage(View view){
        String stringMsg;
        EditText editTextMsg;
        //Link UI to the program
        editTextMsg = findViewById(R.id.editTextMessage);
        // Check got prompt message or not
        if(TextUtils.isEmpty(editTextMsg.getText())){
            editTextMsg.setError(getString(R.string.error_message));
            return;
        }
        stringMsg = editTextMsg.getText().toString();

        //Explicit Intent
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra(Message_TAG, stringMsg);




        startActivity(intent);
        //startActivity(intent)
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_REPLY_CODE){
            (resultCode == RESULT_OK){
                if(data.hasExtra())


            }


        }

        //TODO: Complete the results handling process




    }
}
