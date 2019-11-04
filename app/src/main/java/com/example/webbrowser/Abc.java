package com.example.webbrowser;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class Abc extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);
        WebView v1=(WebView)findViewById(R.id.wv);
        Bundle b=getIntent().getExtras();
        String s2=b.getString("v1");
        String s1="https://"+s2+".com";
        Toast.makeText(this, s1, Toast.LENGTH_LONG).show();
        v1.loadUrl(s1);
    }
}
