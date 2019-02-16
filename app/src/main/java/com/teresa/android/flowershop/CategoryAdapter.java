package com.teresa.android.flowershop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<CategoryItem> {

    Context context;

    public CategoryAdapter(Context context, ArrayList<CategoryItem> list) {
        super(context, 0, list);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_category_item, parent, false);

        final CategoryItem currentCategoryItem = getItem(position);
        ImageView categoryImageView = convertView.findViewById(R.id.item_image_view);
        categoryImageView.setImageResource(currentCategoryItem.getImage());
        TextView categoryTextView = convertView.findViewById(R.id.item_text_view);
        categoryTextView.setText(currentCategoryItem.getName());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, FlowerActivityDetail.class);
                i.putExtra("flowerName",currentCategoryItem.getName());
                i.putExtra("flowerImage", currentCategoryItem.getImage());
                i.putExtra("flowerDescription",currentCategoryItem.getDescription());
                context.startActivity(i);
            }
        });

        return convertView;
    }
}
