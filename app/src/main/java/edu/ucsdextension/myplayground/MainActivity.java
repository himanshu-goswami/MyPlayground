package edu.ucsdextension.myplayground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button UCSDbutton, CNNbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UCSDbutton = (Button) findViewById(R.id.buttonUCSD);
        UCSDbutton.setOnClickListener(this);

        CNNbutton = (Button) findViewById(R.id.buttonCNN);
        CNNbutton.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.buttonUCSD:
                Intent y;
                y = new Intent(this, UCSDExtensionWebView.class);
                startActivity(y);
            case R.id.buttonCNN:
                Intent u;
                u = new Intent(this, CNNWebView.class);
                startActivity(u);

        }


    }
}
