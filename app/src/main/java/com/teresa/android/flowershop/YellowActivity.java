package com.teresa.android.flowershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class YellowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow);

        ArrayList<CategoryItem> yellowFlowers= new ArrayList<>();
        yellowFlowers.add(new CategoryItem("Primrose", R.drawable.primrose));
        yellowFlowers.add(new CategoryItem("Marigold",R.drawable.marigold));
        yellowFlowers.add(new CategoryItem("Buttercup", R.drawable.buttercup));
        yellowFlowers.add(new CategoryItem("Sunflower", R.drawable.sun));
        yellowFlowers.add(new CategoryItem("Lotus", R.drawable.lotus));
        yellowFlowers.add(new CategoryItem("Tansy", R.drawable.tansy));
        yellowFlowers.add(new CategoryItem("Zinnia", R.drawable.zinnia));
        yellowFlowers.add(new CategoryItem("Tulip", R.drawable.yellow2lip));
        yellowFlowers.add(new CategoryItem("Hibiscus", R.drawable.yllwh));


        CategoryAdapter adapter = new CategoryAdapter(this, yellowFlowers);
        ListView listView = findViewById(R.id.yellow_flowers);
        listView.setAdapter(adapter);
    }
}
