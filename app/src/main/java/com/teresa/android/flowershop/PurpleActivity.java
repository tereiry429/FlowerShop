package com.teresa.android.flowershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PurpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purple);


        ArrayList<CategoryItem> purpleFlowers= new ArrayList<>();
        purpleFlowers.add(new CategoryItem("Leather Flower", R.drawable.leather));
        purpleFlowers.add(new CategoryItem("Hydrangea",R.drawable.hydrangea));
        purpleFlowers.add(new CategoryItem("Eustoma", R.drawable.eus));
        purpleFlowers.add(new CategoryItem("Platycodon", R.drawable.platy));
        purpleFlowers.add(new CategoryItem("Petunia", R.drawable.petunia));
        purpleFlowers.add(new CategoryItem("Campanula", R.drawable.bellf));
        purpleFlowers.add(new CategoryItem("Pansy", R.drawable.pansy));
        purpleFlowers.add(new CategoryItem("Orchidaceae", R.drawable.orchid));
        purpleFlowers.add(new CategoryItem("Sweet Pea", R.drawable.sweetp));


        CategoryAdapter adapter = new CategoryAdapter(this, purpleFlowers);
        ListView listView = findViewById(R.id.purple_flowers);
        listView.setAdapter(adapter);
    }
}
