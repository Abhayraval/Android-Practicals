package com.example.practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count=0;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.textView);
    }
    public void decrease(View view) {
        Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();
        count-- ;
        if(showCount != null){
            showCount.setText(Integer.toString(count));
        }
    }

    public void increase(View view) {
        Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();
        count++ ;
        if(showCount != null){
            showCount.setText(Integer.toString(count));
        }
    }
}