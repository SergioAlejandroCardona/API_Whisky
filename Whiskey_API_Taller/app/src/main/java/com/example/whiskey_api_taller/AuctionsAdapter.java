package com.example.whiskey_api_taller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.whiskey_api_taller.Models.Auction;
import com.example.whiskey_api_taller.Models.Distillery;

import java.util.ArrayList;
import java.util.List;

import retrofit2.http.Url;

public class AuctionsAdapter extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Auction> myAuctions;

    public AuctionsAdapter(Activity activity, ArrayList<Auction> AuctionsList){

        this.activity = activity;
        this.myAuctions = AuctionsList;
    }

    @Override
    public int getCount() {
        return myAuctions.size();
    }

    @Override
    public Object getItem(int position) {
        return myAuctions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (convertView == null){

            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.auctions_item, null);
        }

        Auction auction = myAuctions.get(position);

        TextView nameAuction = v.findViewById(R.id.tv_Name_Auction);
        nameAuction.setText(auction.getName_auction());

        TextView slugAuction = v.findViewById(R.id.tv_Slug_Auction);
        slugAuction.setText(auction.getSlug_auction());

        TextView Buyers_fee_Auction = v.findViewById(R.id.tv_Buyers_fee_Auction);
        Buyers_fee_Auction.setText(String.valueOf(auction.getBuyers_fee_auction()));

        TextView Sellers_fee_Auction = v.findViewById(R.id.tv_Sellers_fee_Auction);
        Sellers_fee_Auction.setText(String.valueOf(auction.getSellers_fee_auction()));

        TextView Reserve_fee_Auction = v.findViewById(R.id.tv_Reserve_fee_Auction);
        Reserve_fee_Auction.setText(String.valueOf(auction.getReserve_fee_auction()));

        TextView Listing_fee_Auction = v.findViewById(R.id.tv_Listing_fee_Auction);
        Listing_fee_Auction.setText(String.valueOf(auction.getListing_fee_auction()));

        TextView Base_currency_Auction = v.findViewById(R.id.tv_Base_currency_Auction);
        Base_currency_Auction.setText(auction.getBase_currency_auction());

        return v;
    }

}
