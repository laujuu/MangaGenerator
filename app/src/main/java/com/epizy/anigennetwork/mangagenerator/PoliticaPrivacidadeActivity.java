package com.epizy.anigennetwork.mangagenerator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;

public class PoliticaPrivacidadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politica_privacidade);

        WebView webView = (WebView)findViewById(R.id.wv_content);
        webView.loadUrl("file:///android_asset/policita_privacidade.html");
    }
}
