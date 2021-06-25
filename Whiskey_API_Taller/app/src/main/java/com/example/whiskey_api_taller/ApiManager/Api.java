package com.example.whiskey_api_taller.ApiManager;

import com.example.whiskey_api_taller.Models.Auction;
import com.example.whiskey_api_taller.Models.Distillery;
import com.example.whiskey_api_taller.Models.Slug;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    String BASE_URL = "https://whiskyhunter.net/api/";

    @GET("distilleries_info")
    Call<List<Distillery>> getDestilerias();

    @GET("auctions_info")
    Call<List<Auction>> getAuctions();

    @GET("auction_data/{slug}")
    Call<List<Slug>> getSlug(@Path("slug") String slug);
}
