package edu.ucsdextension.myplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CNNWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnnweb_view);


        WebView CNNWebview = (WebView) findViewById(R.id.CNNWebView);
        CNNWebview.loadUrl("https://www.cnn.com/");
    }
    }

