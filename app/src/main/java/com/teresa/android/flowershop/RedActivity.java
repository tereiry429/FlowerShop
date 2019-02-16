package com.teresa.android.flowershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);

        ArrayList<CategoryItem>  redFlowers= new ArrayList<>();
        redFlowers.add(new CategoryItem("Rose", R.drawable.redroses));
        redFlowers.add(new CategoryItem("Dahlia",R.drawable.d));
        redFlowers.add(new CategoryItem("Amaryllis", R.drawable.reda));
        redFlowers.add(new CategoryItem("Anemone", R.drawable.anem));
        redFlowers.add(new CategoryItem("Anthurium", R.drawable.ant));
        redFlowers.add(new CategoryItem("Peony", R.drawable.peony));
        redFlowers.add(new CategoryItem("Carnation", R.drawable.petalosrojos));
        redFlowers.add(new CategoryItem("Lilium", R.drawable.lily));
        redFlowers.add(new CategoryItem("Daylily", R.drawable.day));
        redFlowers.add(new CategoryItem("Lobelia cardinalis", R.drawable.cardinal));


        CategoryAdapter adapter = new CategoryAdapter(this, redFlowers);
        ListView listView = findViewById(R.id.red_flowers);
        listView.setAdapter(adapter);
    }
}
