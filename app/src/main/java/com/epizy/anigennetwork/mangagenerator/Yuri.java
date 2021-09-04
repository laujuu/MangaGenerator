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

public class Yuri extends AppCompatActivity {


    ImageView imageView;
    Button buttong, buttoneng, buttonport, buttonesp;
    TextView mtitle, mgenre, mauthor, msummary;
    Random r;

    Integer[] images = {
            R.drawable.img0053, R.drawable.img0390, R.drawable.img0391, R.drawable.img0392,
            R.drawable.img0393, R.drawable.img0394, R.drawable.img0395, R.drawable.img0396,
            R.drawable.img0397, R.drawable.img0398, R.drawable.img0399, R.drawable.img0400,
            R.drawable.img0401, R.drawable.img0402, R.drawable.img0403, R.drawable.img0404,
            R.drawable.img0405, R.drawable.img0406, R.drawable.img0407, R.drawable.img0408,
            R.drawable.img0409, R.drawable.img0410, R.drawable.img0411, R.drawable.img0412,
            R.drawable.img0413, R.drawable.img0414, R.drawable.img0415, R.drawable.img0416,
            R.drawable.img0417, R.drawable.img0418, R.drawable.img0419, R.drawable.img0420,
    };

    //admob
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuri);
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
        mAdView = findViewById(R.id.adView34);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //id app
        MobileAds.initialize(this,
                "ca-app-pub-2432784453160983~3511828159");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2432784453160983/1022230339");
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
                if (randomResource == R.drawable.img0053) {
                    mtitle.setText(R.string.title0053);
                    mgenre.setText(R.string.genre0053);
                    mauthor.setText(R.string.author0053);
                    msummary.setText(R.string.summary0053);

                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Tamen De Gushi+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&biw=1920&bih=913&sxsrf=ALeKk012bup1lIkkdk0txQSvyWBOnFpjDw%3A1617464218469&ei=motoYKuJHKWd5OUP4ri5yAk&oq=Solo+Leveling+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAM6BwgjELACECdQ_iVYuTBg7DFoAXAAeACAAYgBiAG4CJIBAzAuOZgBAKABAaoBB2d3cy13aXrAAQE&sclient=gws-wiz&ved=0ahUKEwirvrbhs-LvAhWlDrkGHWJcDpkQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Tamen De Gushi+ler+online&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk00taj15d1Mxmt0zMkK7f2j1_Sia1A%3A1617464049372&ei=8YpoYPeaFoK-5OUPkIqS8AY&oq=Solo+Leveling+ler+online&gs_lcp=Cgdnd3Mtd2l6EAM6BQgAEMsBOgIILjoCCABQtaMCWNGyAmCzswJoAnAAeACAAXyIAZAJkgEEMC4xMJgBAKABAaoBB2d3cy13aXrAAQE&sclient=gws-wiz&ved=0ahUKEwi31-WQs-LvAhUCH7kGHRCFBG4Q4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Tamen De Gushi+read+manga+online&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk00gOM8veZM4Hj5f11FGzmYtlbn4jQ%3A1617464122627&ei=OotoYKnaJZ6i5OUP3pWiyAI&oq=Solo+Leveling+read+manga+online&gs_lcp=Cgdnd3Mtd2l6EAM6BwgjELADECc6BwgAEEcQsAM6BAgjECdQ2htY5Chg-yloA3ACeACAAZcBiAG8B5IBAzAuOJgBAKABAaoBB2d3cy13aXrIAQTAAQE&sclient=gws-wiz&ved=0ahUKEwip39yzs-LvAhUeEbkGHd6KCCkQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                } else if (randomResource == R.drawable.img0390) {
                    mtitle.setText(R.string.title0390);
                    mgenre.setText(R.string.genre0390);
                    mauthor.setText(R.string.author0390);
                    msummary.setText(R.string.summary0390);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=I Favor The Villainess+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=I Favor The Villainess+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=I Favor The Villainess+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0391) {
                    mtitle.setText(R.string.title0391);
                    mgenre.setText(R.string.genre0391);
                    mauthor.setText(R.string.author0391);
                    msummary.setText(R.string.summary0391);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=My Stepsister's Social Media+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=My Stepsister's Social Media+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=My Stepsister's Social Media+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0392) {
                    mtitle.setText(R.string.title0392);
                    mgenre.setText(R.string.genre0392);
                    mauthor.setText(R.string.author0392);
                    msummary.setText(R.string.summary0392);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Sheep Princess In Wolf's Clothing+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Sheep Princess In Wolf's Clothing+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Sheep Princess In Wolf's Clothing+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0393) {
                    mtitle.setText(R.string.title0393);
                    mgenre.setText(R.string.genre0393);
                    mauthor.setText(R.string.author0393);
                    msummary.setText(R.string.summary0393);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kinsei No Reveal+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kinsei No Reveal+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kinsei No Reveal+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0394) {
                    mtitle.setText(R.string.title0394);
                    mgenre.setText(R.string.genre0394);
                    mauthor.setText(R.string.author0394);
                    msummary.setText(R.string.summary0394);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=My Food Seems To Be Very Cute+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=My Food Seems To Be Very Cute+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=My Food Seems To Be Very Cute+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0395) {
                    mtitle.setText(R.string.title0395);
                    mgenre.setText(R.string.genre0395);
                    mauthor.setText(R.string.author0395);
                    msummary.setText(R.string.summary0395);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Suimitsutou Ha Shoujo Ni Kajirareru+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Suimitsutou Ha Shoujo Ni Kajirareru+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Suimitsutou Ha Shoujo Ni Kajirareru+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0396) {
                    mtitle.setText(R.string.title0396);
                    mgenre.setText(R.string.genre0396);
                    mauthor.setText(R.string.author0396);
                    msummary.setText(R.string.summary0396);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Hero's Marriage+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Hero's Marriage+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Hero's Marriage+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0397) {
                    mtitle.setText(R.string.title0397);
                    mgenre.setText(R.string.genre0397);
                    mauthor.setText(R.string.author0397);
                    msummary.setText(R.string.summary0397);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Mojito+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Mojito+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Mojito+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0398) {
                    mtitle.setText(R.string.title0398);
                    mgenre.setText(R.string.genre0398);
                    mauthor.setText(R.string.author0398);
                    msummary.setText(R.string.summary0398);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Asumi-chan is interested in Lesbian Brothels!+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Asumi-chan is interested in Lesbian Brothels!+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Asumi-chan is interested in Lesbian Brothels!+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0399) {
                    mtitle.setText(R.string.title0399);
                    mgenre.setText(R.string.genre0399);
                    mauthor.setText(R.string.author0399);
                    msummary.setText(R.string.summary0399);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Xian Chan Nu+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Xian Chan Nu+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Xian Chan Nu+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0400) {
                    mtitle.setText(R.string.title0400);
                    mgenre.setText(R.string.genre0400);
                    mauthor.setText(R.string.author0400);
                    msummary.setText(R.string.summary0400);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Barefoot Nina+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Barefoot Nina+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Barefoot Nina+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0401) {
                    mtitle.setText(R.string.title0401);
                    mgenre.setText(R.string.genre0401);
                    mauthor.setText(R.string.author0401);
                    msummary.setText(R.string.summary0401);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kanojo no Kuchidzuke Kansensuru Libido+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kanojo no Kuchidzuke Kansensuru Libido+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kanojo no Kuchidzuke Kansensuru Libido+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0402) {
                    mtitle.setText(R.string.title0402);
                    mgenre.setText(R.string.genre0402);
                    mauthor.setText(R.string.author0402);
                    msummary.setText(R.string.summary0402);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Murenase! Shiiton Gakuen HHH+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Murenase! Shiiton Gakuen HHH+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Murenase! Shiiton Gakuen HHH+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0403) {
                    mtitle.setText(R.string.title0403);
                    mgenre.setText(R.string.genre0403);
                    mauthor.setText(R.string.author0403);
                    msummary.setText(R.string.summary0403);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Warikitta Kankei Desukara.+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Warikitta Kankei Desukara.+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Warikitta Kankei Desukara.+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0404) {
                    mtitle.setText(R.string.title0404);
                    mgenre.setText(R.string.genre0404);
                    mauthor.setText(R.string.author0404);
                    msummary.setText(R.string.summary0404);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Witch Guild Fantasia+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Witch Guild Fantasia+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Witch Guild Fantasia+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0405) {
                    mtitle.setText(R.string.title0405);
                    mgenre.setText(R.string.genre0405);
                    mauthor.setText(R.string.author0405);
                    msummary.setText(R.string.summary0405);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Incapable Married Princess+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Incapable Married Princess+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Incapable Married Princess+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0406) {
                    mtitle.setText(R.string.title0406);
                    mgenre.setText(R.string.genre0406);
                    mauthor.setText(R.string.author0406);
                    msummary.setText(R.string.summary0406);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Onna Tomodachi to Kekkon Shitemita+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Onna Tomodachi to Kekkon Shitemita+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Onna Tomodachi to Kekkon Shitemita+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0407) {
                    mtitle.setText(R.string.title0407);
                    mgenre.setText(R.string.genre0407);
                    mauthor.setText(R.string.author0407);
                    msummary.setText(R.string.summary0407);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Two of Them Are Pretty Much Like This+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Two of Them Are Pretty Much Like This+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=The Two of Them Are Pretty Much Like This+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0408) {
                    mtitle.setText(R.string.title0408);
                    mgenre.setText(R.string.genre0408);
                    mauthor.setText(R.string.author0408);
                    msummary.setText(R.string.summary0408);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Shimeji Simulation+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Shimeji Simulation+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Shimeji Simulation+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0409) {
                    mtitle.setText(R.string.title0409);
                    mgenre.setText(R.string.genre0409);
                    mauthor.setText(R.string.author0409);
                    msummary.setText(R.string.summary0409);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kyou Kara Mirai+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kyou Kara Mirai+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Kyou Kara Mirai+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0410) {
                    mtitle.setText(R.string.title0410);
                    mgenre.setText(R.string.genre0410);
                    mauthor.setText(R.string.author0410);
                    msummary.setText(R.string.summary0410);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Himegami no Miko+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Himegami no Miko+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Himegami no Miko+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0411) {
                    mtitle.setText(R.string.title0411);
                    mgenre.setText(R.string.genre0411);
                    mauthor.setText(R.string.author0411);
                    msummary.setText(R.string.summary0411);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Itoshi Koishi+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Itoshi Koishi+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Itoshi Koishi+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0412) {
                    mtitle.setText(R.string.title0412);
                    mgenre.setText(R.string.genre0412);
                    mauthor.setText(R.string.author0412);
                    msummary.setText(R.string.summary0412);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Can't Defy the Lonely Girl+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Can't Defy the Lonely Girl+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Can't Defy the Lonely Girl+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0413) {
                    mtitle.setText(R.string.title0413);
                    mgenre.setText(R.string.genre0413);
                    mauthor.setText(R.string.author0413);
                    msummary.setText(R.string.summary0413);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=I'm An Elite Angel, But I'm Troubled By An Impregnable High School Girl+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=I'm An Elite Angel, But I'm Troubled By An Impregnable High School Girl+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=I'm An Elite Angel, But I'm Troubled By An Impregnable High School Girl+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0414) {
                    mtitle.setText(R.string.title0414);
                    mgenre.setText(R.string.genre0414);
                    mauthor.setText(R.string.author0414);
                    msummary.setText(R.string.summary0414);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=GGWP. ~Young Ladies Don't Play Fighting Games~+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=GGWP. ~Young Ladies Don't Play Fighting Games~+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=GGWP. ~Young Ladies Don't Play Fighting Games~+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0415) {
                    mtitle.setText(R.string.title0415);
                    mgenre.setText(R.string.genre0415);
                    mauthor.setText(R.string.author0415);
                    msummary.setText(R.string.summary0415);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Futari Escape+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Futari Escape+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Futari Escape+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0416) {
                    mtitle.setText(R.string.title0416);
                    mgenre.setText(R.string.genre0416);
                    mauthor.setText(R.string.author0416);
                    msummary.setText(R.string.summary0416);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Hatsukoi, Tokimeki Usuihon+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Hatsukoi, Tokimeki Usuihon+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Hatsukoi, Tokimeki Usuihon+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0417) {
                    mtitle.setText(R.string.title0417);
                    mgenre.setText(R.string.genre0417);
                    mauthor.setText(R.string.author0417);
                    msummary.setText(R.string.summary0417);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Do You Think Someone Like You Could Defeat the Demon Lord?+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Do You Think Someone Like You Could Defeat the Demon Lord?+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Do You Think Someone Like You Could Defeat the Demon Lord?+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0418) {
                    mtitle.setText(R.string.title0418);
                    mgenre.setText(R.string.genre0418);
                    mauthor.setText(R.string.author0418);
                    msummary.setText(R.string.summary0418);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Today, We Continue Our Lives Together Under the Same Roof+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Today, We Continue Our Lives Together Under the Same Roof+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Today, We Continue Our Lives Together Under the Same Roof+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0419) {
                    mtitle.setText(R.string.title0419);
                    mgenre.setText(R.string.genre0419);
                    mauthor.setText(R.string.author0419);
                    msummary.setText(R.string.summary0419);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Mutually Unrequited Twin Sisters+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Mutually Unrequited Twin Sisters+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Mutually Unrequited Twin Sisters+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });
                } else if (randomResource == R.drawable.img0420) {
                    mtitle.setText(R.string.title0420);
                    mgenre.setText(R.string.genre0420);
                    mauthor.setText(R.string.author0420);
                    msummary.setText(R.string.summary0420);


                    buttonesp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Ienai Himitsu No Aishikata+manga+online+espa%C3%B1ol&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk033qChHaSxEgG7qDREiA76r8F0kng%3A1617363544622&ei=WAJnYNO4JZnD5OUPwpG3qAs&oq=tales+of+demons+and+gods+manga+online+espa%C3%B1ol&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BwgAEEcQsAM6BggAEAcQHlCYfVi8hgFg3YcBaAFwAngAgAG7AYgBqAeSAQMwLjeYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjTxLLcvN_vAhWZIbkGHcLIDbUQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttonport.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Ienai Himitsu No Aishikata+ler+online+em+%22portugu%C3%AAs%22&rlz=1C1SQJL_enBR915BR915&sxsrf=ALeKk003axqkeNZ63TyXsrthlBpzzHUY0g%3A1617363926376&ei=1gNnYM-4FqO_5OUPyPi82A8&oq=tales+of+demons+and+gods+ler+online+em+%22portugu%C3%AAs%22&gs_lcp=Cgdnd3Mtd2l6EAMyCAghEBYQHRAeOgcIABBHELADOgQIIxAnUI0fWKsmYKoraAJwAngAgAGoAYgBngSSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6yAEIwAEB&sclient=gws-wiz&ved=0ahUKEwjP-7aSvt_vAhWjH7kGHUg8D_sQ4dUDCA0&uact=5"); // missing 'http://' will cause crashed
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                    });

                    buttoneng.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Uri uri = Uri.parse("http://www.google.com/search?q=Ienai Himitsu No Aishikata+Read+Online&rlz=1C1SQJL_enBR915BR915&oq=Tales+Of+Demons+And+Gods+Read+Online&aqs=chrome..69i57.5869j0j7&sourceid=chrome&ie=UTF-8"); // missing 'http://' will cause crashed
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
