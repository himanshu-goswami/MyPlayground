package edu.ucsdextension.myplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class UCSDExtensionWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucsdextension_web_view);


        WebView UCSDWebview = (WebView) findViewById(R.id.UCSDWebView);
        UCSDWebview.loadUrl("https://extension.ucsd.edu/");
    }
}
