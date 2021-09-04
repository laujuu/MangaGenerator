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

public class Yaoi extends AppCompatActivity {


    ImageView imageView;
    Button buttong, buttoneng, buttonport, buttonesp;
    TextView mtitle, mgenre, mauthor, msummary;
    Random r;

    Integer[] images = {
            R.drawable.img0058, R.drawable.img0165, R.drawable.img0241, R.drawable.img0253,
            R.drawable.img0358, R.drawable.img0370, R.drawable.img0421, R.drawable.img0422,
            R.drawable.img0423, R.drawable.img0424, R.drawable.img0425, R.drawable.img0426,
            R.drawable.img0427, R.drawable.img0428, R.drawable.img0429, R.drawable.img0430,
            R.drawable.img0431, R.drawable.img0432, R.drawable.img0433, R.drawable.img0434,
            R.drawable.img0435, R.drawable.img0436, R.drawable.img0437, R.drawable.img0437,
            R.drawable.img0438, R.drawable.img0439, R.drawable.img0440, R.drawable.img0441,
            R.drawable.img0442, R.drawable.img0443,
      };

    //admob
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yaoi);
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
        mAdView = findViewById(R.id.adView33);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //id app
        MobileAds.initialize(this,
                "ca-app-pub-2432784453160983~3511828159");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2432784453160983/7180444579");
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
                if (randomResource == R.drawable.img0058) {
                    mtitle.setText(R.string.title0058);
                    mgenre.setText(R.string.genre0058);
                    mauthor.setText(R.string.author0058);
                    msummary.setText(R.string.summary0058);

                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=19 Days+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&biw=1920&bih=913&sxsrf=ALeKk012bup1lIkkdk0txQSvyWBOnFpjDw%3A1617464218469&ei=motoYKuJHKWd5OUP4ri5yAk&oq=Solo+Leveling+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAM6BwgjELACECdQ_iVYuTBg7DFoAXAAeACAAYgBiAG4CJIBAzAuOZgBAKABAaoBB2d3cy13aXrAAQE&sclient=gws-wiz&ved=0ahUKEwirvrbhs-LvAhWlDrkGHWJcDpkQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=19 Days+ler+online&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk00taj15d1Mxmt0zMkK7f2j1_Sia1A%3A1617464049372&ei=8YpoYPeaFoK-5OUPkIqS8AY&oq=Solo+Leveling+ler+online&gs_lcp=Cgdnd3Mtd2l6EAM6BQgAEMsBOgIILjoCCABQtaMCWNGyAmCzswJoAnAAeACAAXyIAZAJkgEEMC4xMJgBAKABAaoBB2d3cy13aXrAAQE&sclient=gws-wiz&ved=0ahUKEwi31-WQs-LvAhUCH7kGHRCFBG4Q4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=19 Days+read+manga+online&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk00gOM8veZM4Hj5f11FGzmYtlbn4jQ%3A1617464122627&ei=OotoYKnaJZ6i5OUP3pWiyAI&oq=Solo+Leveling+read+manga+online&gs_lcp=Cgdnd3Mtd2l6EAM6BwgjELADECc6BwgAEEcQsAM6BAgjECdQ2htY5Chg-yloA3ACeACAAZcBiAG8B5IBAzAuOJgBAKABAaoBB2d3cy13aXrIAQTAAQE&sclient=gws-wiz&ved=0ahUKEwip39yzs-LvAhUeEbkGHd6KCCkQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                } else if (randomResource == R.drawable.img0165) {
                    mtitle.setText(R.string.title0165);
                    mgenre.setText(R.string.genre0165);
                    mauthor.setText(R.string.author0165);
                    msummary.setText(R.string.summary0165);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Here U Are+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Here U Are+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Here U Are+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0241) {
                    mtitle.setText(R.string.title0241);
                    mgenre.setText(R.string.genre0241);
                    mauthor.setText(R.string.author0241);
                    msummary.setText(R.string.summary0241);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Berserk of Gluttony+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Berserk of Gluttony+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Berserk of Gluttony+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0253) {
                    mtitle.setText(R.string.title0253);
                    mgenre.setText(R.string.genre0253);
                    mauthor.setText(R.string.author0253);
                    msummary.setText(R.string.summary0253);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Killing Stalking+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Killing Stalking+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Killing Stalking+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0358) {
                    mtitle.setText(R.string.title0358);
                    mgenre.setText(R.string.genre0358);
                    mauthor.setText(R.string.author0358);
                    msummary.setText(R.string.summary0358);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Ancestor’s foolish disciple+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Ancestor’s foolish disciple+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Ancestor’s foolish disciple+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0370) {
                    mtitle.setText(R.string.title0370);
                    mgenre.setText(R.string.genre0370);
                    mauthor.setText(R.string.author0370);
                    msummary.setText(R.string.summary0370);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=I Married My Father-In-Law+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=I Married My Father-In-Law+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=I Married My Father-In-Law+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0421) {
                    mtitle.setText(R.string.title0421);
                    mgenre.setText(R.string.genre0421);
                    mauthor.setText(R.string.author0421);
                    msummary.setText(R.string.summary0421);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Yours To Claim+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Yours To Claim+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Yours To Claim+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0422) {
                    mtitle.setText(R.string.title0422);
                    mgenre.setText(R.string.genre0422);
                    mauthor.setText(R.string.author0422);
                    msummary.setText(R.string.summary0422);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=My One And Only Cat+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=My One And Only Cat+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=My One And Only Cat+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0423) {
                    mtitle.setText(R.string.title0423);
                    mgenre.setText(R.string.genre0423);
                    mauthor.setText(R.string.author0423);
                    msummary.setText(R.string.summary0423);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Master’s Flirting With Me Again+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Master’s Flirting With Me Again+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Master’s Flirting With Me Again+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0424) {
                    mtitle.setText(R.string.title0424);
                    mgenre.setText(R.string.genre0424);
                    mauthor.setText(R.string.author0424);
                    msummary.setText(R.string.summary0424);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Holding Room+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Holding Room+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Holding Room+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0425) {
                    mtitle.setText(R.string.title0425);
                    mgenre.setText(R.string.genre0425);
                    mauthor.setText(R.string.author0425);
                    msummary.setText(R.string.summary0425);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Where The Wind Stays [Mature]+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Where The Wind Stays [Mature]+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Where The Wind Stays [Mature]+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0426) {
                    mtitle.setText(R.string.title0426);
                    mgenre.setText(R.string.genre0426);
                    mauthor.setText(R.string.author0426);
                    msummary.setText(R.string.summary0426);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Heat and Run+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Heat and Run+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Heat and Run+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0427) {
                    mtitle.setText(R.string.title0427);
                    mgenre.setText(R.string.genre0427);
                    mauthor.setText(R.string.author0427);
                    msummary.setText(R.string.summary0427);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=How To Chase An Alpha+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=How To Chase An Alpha+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=How To Chase An Alpha+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0428) {
                    mtitle.setText(R.string.title0428);
                    mgenre.setText(R.string.genre0428);
                    mauthor.setText(R.string.author0428);
                    msummary.setText(R.string.summary0428);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Xxx Buddy+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Xxx Buddy+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Xxx Buddy+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0429) {
                    mtitle.setText(R.string.title0429);
                    mgenre.setText(R.string.genre0429);
                    mauthor.setText(R.string.author0429);
                    msummary.setText(R.string.summary0429);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Six Sense+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Six Sense+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Six Sense+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0430) {
                    mtitle.setText(R.string.title0430);
                    mgenre.setText(R.string.genre0430);
                    mauthor.setText(R.string.author0430);
                    msummary.setText(R.string.summary0430);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Fatal Oxygen+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Fatal Oxygen+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Fatal Oxygen+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0431) {
                    mtitle.setText(R.string.title0431);
                    mgenre.setText(R.string.genre0431);
                    mauthor.setText(R.string.author0431);
                    msummary.setText(R.string.summary0431);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Madman Combo+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Madman Combo+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Madman Combo+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0432) {
                    mtitle.setText(R.string.title0432);
                    mgenre.setText(R.string.genre0432);
                    mauthor.setText(R.string.author0432);
                    msummary.setText(R.string.summary0432);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Your Highness, Please Don’t Be a Demon+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Your Highness, Please Don’t Be a Demon+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Your Highness, Please Don’t Be a Demon+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0433) {
                    mtitle.setText(R.string.title0433);
                    mgenre.setText(R.string.genre0433);
                    mauthor.setText(R.string.author0433);
                    msummary.setText(R.string.summary0433);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kinks In Development+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kinks In Development+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kinks In Development+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0434) {
                    mtitle.setText(R.string.title0434);
                    mgenre.setText(R.string.genre0434);
                    mauthor.setText(R.string.author0434);
                    msummary.setText(R.string.summary0434);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Fu Fu Qing Cheng+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Fu Fu Qing Cheng+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Fu Fu Qing Cheng+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0435) {
                    mtitle.setText(R.string.title0435);
                    mgenre.setText(R.string.genre0435);
                    mauthor.setText(R.string.author0435);
                    msummary.setText(R.string.summary0435);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Anti P.t.+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Anti P.t.+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Anti P.t.+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0436) {
                    mtitle.setText(R.string.title0436);
                    mgenre.setText(R.string.genre0436);
                    mauthor.setText(R.string.author0436);
                    msummary.setText(R.string.summary0436);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Gold Gray+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Gold Gray+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Gold Gray+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0437) {
                    mtitle.setText(R.string.title0437);
                    mgenre.setText(R.string.genre0437);
                    mauthor.setText(R.string.author0437);
                    msummary.setText(R.string.summary0437);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Escape, Ray+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Escape, Ray+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Escape, Ray+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0438) {
                    mtitle.setText(R.string.title0438);
                    mgenre.setText(R.string.genre0438);
                    mauthor.setText(R.string.author0438);
                    msummary.setText(R.string.summary0438);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Big Apple+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Big Apple+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Big Apple+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0439) {
                    mtitle.setText(R.string.title0439);
                    mgenre.setText(R.string.genre0439);
                    mauthor.setText(R.string.author0439);
                    msummary.setText(R.string.summary0439);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Haven+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Haven+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Haven+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0440) {
                    mtitle.setText(R.string.title0440);
                    mgenre.setText(R.string.genre0440);
                    mauthor.setText(R.string.author0440);
                    msummary.setText(R.string.summary0440);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Ouroboros：ウロボロス+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Ouroboros：ウロボロス+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Ouroboros：ウロボロス+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0441) {
                    mtitle.setText(R.string.title0441);
                    mgenre.setText(R.string.genre0441);
                    mauthor.setText(R.string.author0441);
                    msummary.setText(R.string.summary0441);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Crown Prince+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Crown Prince+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Crown Prince+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0442) {
                    mtitle.setText(R.string.title0442);
                    mgenre.setText(R.string.genre0442);
                    mauthor.setText(R.string.author0442);
                    msummary.setText(R.string.summary0442);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Lucky Paradise+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Lucky Paradise+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Lucky Paradise+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0443) {
                    mtitle.setText(R.string.title0443);
                    mgenre.setText(R.string.genre0443);
                    mauthor.setText(R.string.author0443);
                    msummary.setText(R.string.summary0443);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Off Stage+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Off Stage+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Off Stage+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                }

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
