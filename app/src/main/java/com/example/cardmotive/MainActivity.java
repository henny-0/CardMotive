package com.example.cardmotive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Card> cardList;
    Adapter adapter;

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.cardGrid);

        cardList = new ArrayList<Card>();

        populateGrid(cardList);

        adapter  = new Adapter(cardList,  MainActivity.this);
        gridView.setAdapter(adapter);


    }

    public void populateGrid(ArrayList<Card> cardList){
        cardList.add(new Card("THANK YOU!", R.drawable.bg1 ));
        cardList.add(new Card("FORTUNE FAVORS THE BOLD",R.drawable.ic_launcher_background ));
        cardList.add(new Card("SOMETIMES LATER BECOMES NEVER",R.drawable.ic_launcher_background ));
        cardList.add(new Card("SMALL STEPS EVERY DAY",R.drawable.ic_launcher_background ));
        cardList.add(new Card("THE BEST DREAMS HAPPEN WHEN YOU'RE AWAKE",R.drawable.ic_launcher_background ));
        cardList.add(new Card("BELIEVE YOU CAN AND YOU'RE HALFWAY THERE",R.drawable.ic_launcher_background ));
        cardList.add(new Card("MAKE TODAY GREAT",R.drawable.ic_launcher_background ));
        cardList.add(new Card("STEP OUT OF THE COMFORT ZONE",R.drawable.ic_launcher_background ));

    }
}