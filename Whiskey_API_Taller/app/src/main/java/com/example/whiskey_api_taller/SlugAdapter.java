package com.example.whiskey_api_taller;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.whiskey_api_taller.Models.Auction;
import com.example.whiskey_api_taller.Models.Slug;

import java.util.List;

public class SlugAdapter extends BaseAdapter {

    Activity activity;
    List<Slug> mySlug;

    public SlugAdapter(Activity activity, List<Slug> mySlug) {
        this.activity = activity;
        this.mySlug = mySlug;
    }

    @Override
    public int getCount() {
        return mySlug.size();
    }

    @Override
    public Object getItem(int position) {
        return mySlug.get(position);
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
            v = inf.inflate(R.layout.slug_item, null);
        }

        Slug slug = mySlug.get(position);

        TextView SlugDt = v.findViewById(R.id.tvDt);
        SlugDt.setText(slug.getDt());

        TextView Slug_winning_bid_max = v.findViewById(R.id.tv_winning_bid_max);
        Slug_winning_bid_max.setText(String.valueOf(slug.getWinning_bid_max()));

        TextView Slug_winning_bid_min = v.findViewById(R.id.tv_winning_bid_min);
        Slug_winning_bid_min.setText(String.valueOf(slug.getWinning_bid_min()));

        TextView Slug_winning_bid_mean = v.findViewById(R.id.tv_winning_bid_mean);
        Slug_winning_bid_mean.setText(String.valueOf(slug.getWinning_bid_mean()));

        TextView Slug_winning_trading_volume = v.findViewById(R.id.tv_winning_trading_volume);
        Slug_winning_trading_volume.setText(String.valueOf(slug.getAuction_trading_volume()));

        TextView Slug_auction_lots_count = v.findViewById(R.id.tv_auction_lots_count);
        Slug_auction_lots_count.setText(String.valueOf(slug.getAuction_lots_count()));

        TextView Slug_all_auctions_lots_count = v.findViewById(R.id.tv_all_auctions_lots_count);
        Slug_all_auctions_lots_count.setText(String.valueOf(slug.getAll_auctions_lots_count()));

        TextView Slug_auction_name = v.findViewById(R.id.tv_auction_name);
        Slug_auction_name.setText(slug.getAuction_name());

        TextView Slug_auction_slug = v.findViewById(R.id.tv_auction_slug);
        Slug_auction_slug.setText(slug.getAuction_slug());

        return v;
    }
}
