package com.epizy.anigennetwork.mangagenerator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class Genres extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agenres);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);
       // setToggleEvent(mainGrid);
        setSingleEvent(mainGrid);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(Genres.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(Genres.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid){
        for(int i =0;i<mainGrid.getChildCount();i++){

            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI == 0){
                        Intent intent = new Intent(Genres.this, MainActivity.class);
                        startActivity(intent);
                    } else if(finalI == 1){
                        Intent intent = new Intent(Genres.this, Action.class);
                        startActivity(intent);
                    } else if(finalI == 2){
                        Intent intent = new Intent(Genres.this, Adventure.class);
                        startActivity(intent);
                    } else if(finalI == 3){
                        Intent intent = new Intent(Genres.this, Comedy.class);
                        startActivity(intent);
                    } else if(finalI == 4){
                        Intent intent = new Intent(Genres.this, Cooking.class);
                        startActivity(intent);
                    } else if(finalI == 5){
                        Intent intent = new Intent(Genres.this, Doujinshi.class);
                        startActivity(intent);
                    } else if(finalI == 6){
                        Intent intent = new Intent(Genres.this, Isekai.class);
                        startActivity(intent);
                    } else if(finalI == 7){
                        Intent intent = new Intent(Genres.this, Drama.class);
                        startActivity(intent);
                    } else if(finalI == 8){
                        Intent intent = new Intent(Genres.this, Manhua.class);
                        startActivity(intent);
                    } else if(finalI == 9){
                        Intent intent = new Intent(Genres.this, Manhwa.class);
                        startActivity(intent);
                    } else if(finalI == 10){
                        Intent intent = new Intent(Genres.this, Tragedy.class);
                        startActivity(intent);
                    } else if(finalI == 11){
                        Intent intent = new Intent(Genres.this, Webtoons.class);
                        startActivity(intent);
                    } else if(finalI == 12){
                        Intent intent = new Intent(Genres.this, SciFi.class);
                        startActivity(intent);
                    } else if(finalI == 13){
                        Intent intent = new Intent(Genres.this, Fantasy.class);
                        startActivity(intent);
                    } else if(finalI == 14){
                        Intent intent = new Intent(Genres.this, Supernatural.class);
                        startActivity(intent);
                    } else if(finalI == 15){
                        Intent intent = new Intent(Genres.this, Horror.class);
                        startActivity(intent);
                    } else if(finalI == 16){
                        Intent intent = new Intent(Genres.this, Mystery.class);
                        startActivity(intent);
                    } else if(finalI == 17){
                        Intent intent = new Intent(Genres.this, Psychological.class);
                        startActivity(intent);
                    } else if(finalI == 18){
                        Intent intent = new Intent(Genres.this, Romance.class);
                        startActivity(intent);
                    } else if(finalI == 19){
                        Intent intent = new Intent(Genres.this, Ecchi.class);
                        startActivity(intent);
                    } else if(finalI == 20){
                        Intent intent = new Intent(Genres.this, SliceOfLife.class);
                        startActivity(intent);
                    } else if(finalI == 21){
                        Intent intent = new Intent(Genres.this, Josei.class);
                        startActivity(intent);
                    } else if(finalI == 22){
                        Intent intent = new Intent(Genres.this, MartialArts.class);
                        startActivity(intent);
                    } else if(finalI == 23){
                        Intent intent = new Intent(Genres.this, Historical.class);
                        startActivity(intent);
                    } else if(finalI == 24){
                        Intent intent = new Intent(Genres.this, School.class);
                        startActivity(intent);
                    } else if(finalI == 25){
                        Intent intent = new Intent(Genres.this, Seinen.class);
                        startActivity(intent);
                    } else if(finalI == 26){
                        Intent intent = new Intent(Genres.this, Shoujo.class);
                        startActivity(intent);
                    } else if(finalI == 27){
                        Intent intent = new Intent(Genres.this, Shounen.class);
                        startActivity(intent);
                    } else if(finalI == 28){
                        Intent intent = new Intent(Genres.this, Sports.class);
                        startActivity(intent);
                    } else if(finalI == 29){
                        Intent intent = new Intent(Genres.this, Yuri.class);
                        startActivity(intent);
                    } else if(finalI == 30){
                        Intent intent = new Intent(Genres.this, Yaoi.class);
                        startActivity(intent);
                    } else if(finalI == 31){
                        Intent intent = new Intent(Genres.this, Harem.class);
                        startActivity(intent);
                    }
                }
            });

        }
    }
}

