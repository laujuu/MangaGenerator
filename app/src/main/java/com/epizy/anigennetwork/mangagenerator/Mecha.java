package com.epizy.anigennetwork.mangagenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epizy.anigennetwork.mangagenerator.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Random;

public class Mecha extends AppCompatActivity {


    ImageView imageView;
    Button buttong, buttoneng, buttonport, buttonesp;
    TextView mtitle, mgenre, mauthor, msummary;
    Random r;

    Integer[] images = {
            R.drawable.img0277,
    };

    //admob
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecha);
        imageView = (ImageView) findViewById(R.id.imageView);


        buttong = (Button) findViewById(R.id.buttong);
        buttoneng = (Button) findViewById(R.id.btnenglish);
        buttonport = (Button) findViewById(R.id.btnportuguese);
        buttonesp = (Button) findViewById(R.id.btnspanish);


        mtitle = (TextView) findViewById(R.id.text_title);
        mgenre = (TextView) findViewById(R.id.text_genre);
        mauthor = (TextView) findViewById(R.id.text_author);
        msummary = (TextView) findViewById(R.id.text_summary);

        r = new Random();



        //admob
        mAdView = findViewById(R.id.adView18);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //id app
        MobileAds.initialize(this,
                "ca-app-pub-2432784453160983~3511828159");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2432784453160983/6709192351");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        //Back Button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(images[r.nextInt(images.length)]);
                //admob
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }

                //handle the random image
                imageView.setImageResource(images[r.nextInt(images.length)]);
                //handle the description text for each random image
                Integer randomResource = images[r.nextInt(images.length)];
                imageView.setImageResource(randomResource);
                // if here


            }
        });
    }

    //Back Button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home){
            //admob
            mInterstitialAd.isLoaded();
            mInterstitialAd.show();
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
