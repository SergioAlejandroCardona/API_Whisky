package com.example.whiskey_api_taller;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.whiskey_api_taller.Models.Distillery;

import java.util.List;

public class DestileriasAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Distillery> mydestiladoras;

    public DestileriasAdapter(Activity activity, List<Distillery> DestiladorasList){

        this.activity = activity;
        this.mydestiladoras = DestiladorasList;
    }

    @Override
    public int getCount() {
        return mydestiladoras.size();
    }

    @Override
    public Object getItem(int position) {
        return mydestiladoras.get(position);
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
            v = inf.inflate(R.layout.destilerias_item, null);
        }

        Distillery detiladora = mydestiladoras.get(position);

        TextView nameDestiladora = v.findViewById(R.id.tvName);
        nameDestiladora.setText(detiladora.getName_Destileria());

        TextView slugDestiladora = v.findViewById(R.id.tvSlug);
        slugDestiladora.setText(detiladora.getSlug_Destileria());

        TextView country_Destiladora = v.findViewById(R.id.tvCountry);
        country_Destiladora.setText(detiladora.getCountry_Destileria());

        TextView whisky_base_whiskies_Destiladora = v.findViewById(R.id.tv_whisky_base_whiskies);
        whisky_base_whiskies_Destiladora.setText(detiladora.getWhiskybase_whiskies_Destileria());

        TextView whisky_base_votes_Destiladora = v.findViewById(R.id.tv_whisky_base_votes);
        whisky_base_votes_Destiladora.setText(detiladora.getWhiskybase_votes_Destileria());

        TextView whisky_base_rating_Destiladora = v.findViewById(R.id.tv_whisky_base_rating);
        whisky_base_rating_Destiladora.setText(detiladora.getWhiskybase_rating_Destileria());

        return v;
    }
}
