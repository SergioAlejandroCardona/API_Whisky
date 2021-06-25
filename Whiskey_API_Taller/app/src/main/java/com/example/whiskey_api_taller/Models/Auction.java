package com.example.whiskey_api_taller.Models;

import com.google.gson.annotations.SerializedName;

public class Auction {

    @SerializedName("name")
    private String name_auction;

    @SerializedName("slug")
    private String slug_auction;

    @SerializedName("url")
    private String url_auction;

    @SerializedName("buyers_fee")
    private double buyers_fee_auction;

    @SerializedName("sellers_fee")
    private double sellers_fee_auction;

    @SerializedName("reserve_fee")
    private double reserve_fee_auction;

    @SerializedName("listing_fee")
    private double listing_fee_auction;

    @SerializedName("base_currency")
    private String base_currency_auction;

    public String getName_auction() {
        return name_auction;
    }

    public void setName_auction(String name_auction) {
        this.name_auction = name_auction;
    }

    public String getSlug_auction() {
        return slug_auction;
    }

    public void setSlug_auction(String slug_auction) {
        this.slug_auction = slug_auction;
    }

    public String getUrl_auction() {
        return url_auction;
    }

    public void setUrl_auction(String url_auction) {
        this.url_auction = url_auction;
    }

    public double getBuyers_fee_auction() {
        return buyers_fee_auction;
    }

    public void setBuyers_fee_auction(double buyers_fee_auction) {
        this.buyers_fee_auction = buyers_fee_auction;
    }

    public double getSellers_fee_auction() {
        return sellers_fee_auction;
    }

    public void setSellers_fee_auction(double sellers_fee_auction) {
        this.sellers_fee_auction = sellers_fee_auction;
    }

    public double getReserve_fee_auction() {
        return reserve_fee_auction;
    }

    public void setReserve_fee_auction(double reserve_fee_auction) {
        this.reserve_fee_auction = reserve_fee_auction;
    }

    public double getListing_fee_auction() {
        return listing_fee_auction;
    }

    public void setListing_fee_auction(double listing_fee_auction) {
        this.listing_fee_auction = listing_fee_auction;
    }

    public String getBase_currency_auction() {
        return base_currency_auction;
    }

    public void setBase_currency_auction(String base_currency_auction) {
        this.base_currency_auction = base_currency_auction;
    }
}
