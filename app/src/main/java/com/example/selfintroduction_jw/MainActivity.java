package com.example.selfintroduction_jw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton Button_Message, Button_More;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button_Message  = findViewById(R.id.Button_Message);
        Button_More     = findViewById(R.id.Button_More);

        Button_Message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_more = new Intent(MainActivity.this,Message_Activity.class);
                startActivity(intent_more);
                finish();
            }
        });

        Button_More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_more = new Intent(MainActivity.this,More_Activity.class);
                startActivity(intent_more);
                finish();
            }
        });





    }
}
