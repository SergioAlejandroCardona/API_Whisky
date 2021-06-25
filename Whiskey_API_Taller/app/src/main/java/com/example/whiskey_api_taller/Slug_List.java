package com.example.whiskey_api_taller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.whiskey_api_taller.ApiManager.RetrofitClient;
import com.example.whiskey_api_taller.Models.Auction;
import com.example.whiskey_api_taller.Models.Slug;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Slug_List extends AppCompatActivity implements View.OnClickListener {

    ListView lv_slug;
    Button btUrl;
    private String slug;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slug__list);
        lv_slug = findViewById(R.id.lvSlug);
        btUrl = findViewById(R.id.btnUrl);

        btUrl.setOnClickListener(this);

        Bundle in = getIntent().getExtras();
        slug = in.getString("slug");
        url = in.getString("url");
        getAuctionBySlug(slug);

    }

    private void getAuctionBySlug(String slug) {
        Call<List<Slug>> call = RetrofitClient.getInstance().getMyApi().getSlug(slug);
        call.enqueue(new Callback<List<Slug>>() {
            @Override
            public void onResponse(Call<List<Slug>> call, Response<List<Slug>> response) {
                List<Slug> mySlug = response.body();

                SlugAdapter adapterS = new SlugAdapter(Slug_List.this, mySlug);
                lv_slug.setAdapter(adapterS);
            }

            @Override
            public void onFailure(Call<List<Slug>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnUrl) {
            Uri _link = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, _link);
            startActivity(intent);
        }
    }


}