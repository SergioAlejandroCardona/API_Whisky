package com.example.whiskey_api_taller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgDestilerias;
    ImageView imgWhiskey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgDestilerias = findViewById(R.id.imgDestilerias);
        imgWhiskey = findViewById(R.id.imgWhiskey);

        imgDestilerias.setOnClickListener(this);
        imgWhiskey.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgDestilerias){
            Intent IntentDestileriasList = new Intent(this, Destilerias_List.class);
            startActivity(IntentDestileriasList);
        }
        if (v.getId() == R.id.imgWhiskey){
            Intent IntentAuctionList = new Intent(this, Auction_List.class);
            startActivity(IntentAuctionList);
        }
    }
}