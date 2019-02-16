package com.teresa.android.flowershop;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class FlowerActivityDetail extends AppCompatActivity {


    int numberOfFlowers = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_detail);

        Intent i = getIntent();
        TextView nameTextView = findViewById(R.id.flower_name);
        nameTextView.setText(i.getStringExtra("flowerName"));

        ImageView nameImageView = findViewById(R.id.flower_image);
        nameImageView.setImageResource(i.getIntExtra("flowerImage", 0));

       // TextView nameDescriptionView = findViewById(R.id.flower_description);
        //nameDescriptionView.setText(i.);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void submitOrder(View view) {

        displayQuantity(numberOfFlowers);
        int price = numberOfFlowers * 2;
        displayPrice(price);
        EditText nameEditText = (EditText) findViewById(R.id.name);
        String orderMessage = "Name: " + nameEditText.getText().toString() + "\n" +
                "Number of Flowers: " + numberOfFlowers + "\n" +
                "Total: $" + price;

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Flores a su Gusto Flower Order");
        intent.putExtra(Intent.EXTRA_TEXT, orderMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("$" + number);


    }


    public void increase(View view) {
        numberOfFlowers++;
        displayQuantity(numberOfFlowers);
        displayPrice(numberOfFlowers * 2);
    }


    public void decrease(View view) {
        if(numberOfFlowers <=0) {
            return;
        }
        numberOfFlowers --;
        displayQuantity(numberOfFlowers);
        displayPrice(numberOfFlowers * 2);
    }
}
