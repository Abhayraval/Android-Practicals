package com.example.db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.db.data.MyDbHandler;
import com.example.db.model.Contacts;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDbHandler db = new MyDbHandler(MainActivity.this);

        Contacts rr = new Contacts();
        rr.setPhoneNumber("5534531");
        rr.setName("ARA");
        db.addContact(rr);
    }
}