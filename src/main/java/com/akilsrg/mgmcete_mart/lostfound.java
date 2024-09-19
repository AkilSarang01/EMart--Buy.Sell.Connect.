package com.akilsrg.mgmcete_mart;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class lostfound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lostfound);

        WebView webView = (WebView)  findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/index.html");
    }
}