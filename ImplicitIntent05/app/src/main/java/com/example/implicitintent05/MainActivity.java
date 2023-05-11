package com.example.implicitintent05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    Implicit intents
//    Create an Android app to Implement an implicit Intent that opens a web page, and another that
//    opens a location on a map. Also, Implement an action to share a snippet of text.

    private EditText webSearch;
    private EditText locationSearch;
    private EditText shareText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webSearch = findViewById(R.id.mLink);
        locationSearch = findViewById(R.id.mLocation);
        shareText = findViewById(R.id.mTextShare);
    }

    public void openLink(View view) {
        String url = webSearch.getText().toString();
        Uri link = Uri.parse(url);
        Intent it = new Intent(Intent.ACTION_VIEW, link);
        if(it.resolveActivity(getPackageManager()) != null){
            startActivity(it);
        }
        else {
            Log.d("ImplicitIntent","Can't Handle this Intent");
        }
    }

    public void findLocation(View view) {
        String location = locationSearch.getText().toString();
        Uri mLocation = Uri.parse("geo:0,0?q=" + location);
        Intent it = new Intent(Intent.ACTION_VIEW, mLocation);
        if(it.resolveActivity(getPackageManager()) != null){
            startActivity(it);
        }
        else {
            Log.d("ImplicitIntent","Can't Handle this Intent");
        }
    }

    public void shareText(View view) {
        String text = shareText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share With")
                .setText(text)
                .startChooser();
    }

    public void takePicture(View view) {
        Intent it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(it.resolveActivity(getPackageManager()) != null){
            startActivity(it);
        }
        else {
            Log.d("ImplicitIntent","Can't Handle this Intent");
        }
    }
}