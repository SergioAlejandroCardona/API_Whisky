package com.example.whiskey_api_taller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.whiskey_api_taller.ApiManager.RetrofitClient;
import com.example.whiskey_api_taller.Models.Distillery;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Destilerias_List extends AppCompatActivity {

    ListView lvDestilerias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destilerias__list);
        lvDestilerias = findViewById(R.id.lvDestilerias);
        getFromInternetDistilleries();
    }

    private void getFromInternetDistilleries() {

        Call<List<Distillery>> call = RetrofitClient.getInstance().getMyApi().getDestilerias();
        call.enqueue(new Callback<List<Distillery>>() {
            @Override
            public void onResponse(Call<List<Distillery>> call, Response<List<Distillery>> response) {
                List<Distillery> myDistilleries = response.body();

                DestileriasAdapter adapter = new DestileriasAdapter(Destilerias_List.this, myDistilleries);
                lvDestilerias.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Distillery>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }



}