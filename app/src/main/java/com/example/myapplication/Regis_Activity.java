package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Regis_Activity extends AppCompatActivity {

    TextView textNews;
    TextView textAbout;
    TextView textRegis;
    TextView textContact;
    TextView textHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_regis);

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

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.regis), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void FormPertama(View view) {
        Intent intent = new Intent(this, FormPertama.class);
        startActivity(intent);
    }

    public void FormKedua(View view) {
        Intent intent = new Intent(this, FormKedua.class);
        startActivity(intent);
    }
}