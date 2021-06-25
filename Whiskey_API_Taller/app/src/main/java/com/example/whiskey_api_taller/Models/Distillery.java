package com.example.whiskey_api_taller.Models;

import com.google.gson.annotations.SerializedName;

public class Distillery {

    @SerializedName("name")
    private String name_Destileria;

    @SerializedName("slug")
    private String slug_Destileria;

    @SerializedName("country")
    private String country_Destileria;

    @SerializedName("whiskybase_whiskies")
    private String whiskybase_whiskies_Destileria;

    @SerializedName("whiskybase_votes")
    private String whiskybase_votes_Destileria;

    @SerializedName("whiskybase_rating")
    private String whiskybase_rating_Destileria;

    public String getName_Destileria() {
        return name_Destileria;
    }

    public void setName_Destileria(String name_Destileria) {
        this.name_Destileria = name_Destileria;
    }

    public String getSlug_Destileria() {
        return slug_Destileria;
    }

    public void setSlug_Destileria(String slug_Destileria) {
        this.slug_Destileria = slug_Destileria;
    }

    public String getCountry_Destileria() {
        return country_Destileria;
    }

    public void setCountry_Destileria(String country_Destileria) {
        this.country_Destileria = country_Destileria;
    }

    public String getWhiskybase_whiskies_Destileria() {
        return whiskybase_whiskies_Destileria;
    }

    public void setWhiskybase_whiskies_Destileria(String whiskybase_whiskies_Destileria) {
        this.whiskybase_whiskies_Destileria = whiskybase_whiskies_Destileria;
    }

    public String getWhiskybase_votes_Destileria() {
        return whiskybase_votes_Destileria;
    }

    public void setWhiskybase_votes_Destileria(String whiskybase_votes_Destileria) {
        this.whiskybase_votes_Destileria = whiskybase_votes_Destileria;
    }

    public String getWhiskybase_rating_Destileria() {
        return whiskybase_rating_Destileria;
    }

    public void setWhiskybase_rating_Destileria(String whiskybase_rating_Destileria) {
        this.whiskybase_rating_Destileria = whiskybase_rating_Destileria;
    }
}
