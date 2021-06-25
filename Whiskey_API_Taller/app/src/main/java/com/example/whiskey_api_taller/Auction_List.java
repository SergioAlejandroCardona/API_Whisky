package com.example.whiskey_api_taller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.whiskey_api_taller.ApiManager.RetrofitClient;
import com.example.whiskey_api_taller.Models.Auction;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Auction_List extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lvAuction;
    List<Auction> myAuctions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFromInternetAuctions();
        setContentView(R.layout.activity_auction__list);
        lvAuction = findViewById(R.id.lvListAuctions);

        lvAuction.setOnItemClickListener(this);
    }

    private void getFromInternetAuctions() {

        Call<List<Auction>> call = RetrofitClient.getInstance().getMyApi().getAuctions();
        call.enqueue(new Callback<List<Auction>>() {
            @Override
            public void onResponse(Call<List<Auction>> call, Response<List<Auction>> response) {
                myAuctions = response.body();

                AuctionsAdapter adapterA = new AuctionsAdapter(Auction_List.this, (ArrayList<Auction>) myAuctions);
                lvAuction.setAdapter(adapterA);
            }

            @Override
            public void onFailure(Call<List<Auction>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent SlugIntent = new Intent(this, Slug_List.class);
        SlugIntent.putExtra("slug", myAuctions.get(position).getSlug_auction());
        SlugIntent.putExtra("url", myAuctions.get(position).getUrl_auction());
        startActivity(SlugIntent);
    }
}