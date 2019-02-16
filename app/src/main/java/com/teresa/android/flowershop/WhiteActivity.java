package com.teresa.android.flowershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WhiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_white);

        ArrayList<CategoryItem> whiteFlowers= new ArrayList<>();
        whiteFlowers.add(new CategoryItem("Primrose", R.drawable.wtulip));
        whiteFlowers.add(new CategoryItem("Baby's Breath",R.drawable.babyb));
        whiteFlowers.add(new CategoryItem("Amaryllis", R.drawable.wpink));
        whiteFlowers.add(new CategoryItem("Daffodil", R.drawable.wdaff));
        whiteFlowers.add(new CategoryItem("Yucca", R.drawable.yucca));
        whiteFlowers.add(new CategoryItem("Carnation", R.drawable.wcar));
        whiteFlowers.add(new CategoryItem("Gardenia", R.drawable.gar));
        whiteFlowers.add(new CategoryItem("Iris", R.drawable.iris));
        whiteFlowers.add(new CategoryItem("Peony", R.drawable.wpeony));


        CategoryAdapter adapter = new CategoryAdapter(this, whiteFlowers);
        ListView listView = findViewById(R.id.white_flowers);
        listView.setAdapter(adapter);
    }
}
