package net.itsvivek.itsvivek;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv1 = (WebView) findViewById(R.id.webview);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://itsvivek.net/blog");




    }



    }


