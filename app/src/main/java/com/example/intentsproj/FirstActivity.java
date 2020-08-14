package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    protected Button myButton;
    String mystring = "Sending message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        OnclickButtonLister();
    }
    public void OnclickButtonLister() {
        myButton = (Button) findViewById(R.id.button);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), mystring, Toast.LENGTH_LONG);


                toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
                toast.show();

                Intent intent=new Intent( FirstActivity.this, SecondeActivity.class);
                startActivity(intent);


            }

        });


    }

}