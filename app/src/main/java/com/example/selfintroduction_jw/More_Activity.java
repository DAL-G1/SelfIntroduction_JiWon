package com.example.selfintroduction_jw;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class More_Activity extends AppCompatActivity {
    ImageButton Button_facebook, Button_instagram;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        Button_facebook = findViewById(R.id.Button_facebook);
        Button_instagram = findViewById(R.id.Button_Instagram);

        Button_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_facebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100006001963899"));
                startActivity(intent_facebook);
                finish();
            }
        });
        Button_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/m00nir_/?hl=ko"));
                startActivity(intent_instagram);
                finish();
            }


        });


    }
}