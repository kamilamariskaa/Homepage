package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home_Activity extends AppCompatActivity {

    TextView textNews, textAbout, textRegis, textContact, textHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.home), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textHome = (TextView) findViewById(R.id.textHome);
        textAbout = (TextView) findViewById(R.id.textAbout);
        textNews = (TextView) findViewById(R.id.textNews);
        textRegis = (TextView) findViewById(R.id.textRegis);
        textContact = (TextView) findViewById(R.id.textContact);

        textHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keHome = new Intent(getApplicationContext(), Home_Activity.class);
                startActivity(keHome);
            }
        });
        textAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keAbout = new Intent(getApplicationContext(), About_Activity.class);
                startActivity(keAbout);
            }
        });
        textNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keNews = new Intent(getApplicationContext(), News_Activity.class);
                startActivity(keNews);
            }
        });
        textRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keRegis = new Intent(getApplicationContext(), Regis_Activity.class);
                startActivity(keRegis);
            }
        });
        textContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keContact = new Intent(getApplicationContext(), Contact_Activity.class);
                startActivity(keContact);
            }
        });

    }
}