package com.example.requisitionandapproval;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.requisitionandapproval.ApiClient.ApiClient;
import com.example.requisitionandapproval.ApiClient.Endpoints;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class itemList extends AppCompatActivity {
    ApiClient apiClient = new ApiClient();

    private Retrofit retrofit;
    private Endpoints endpoints;
    private String Base_URL = apiClient.getBASE_URL();
    private TextView destxt,qty1,price, sef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);


        retrofit = new Retrofit.Builder().baseUrl(Base_URL).addConverterFactory(GsonConverterFactory.create()).build();
        endpoints = retrofit.create(Endpoints.class);

        Button add_item = findViewById(R.id.add_item);
        Button button = findViewById(R.id.button);

        destxt = findViewById(R.id.destxt);
        qty1 = findViewById(R.id.qty1);
        price = findViewById(R.id.price);
        sendGETRequest();


        final RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        destxt = findViewById(R.id.destxt);

        HashMap<String, String> map = new HashMap<>();

        map.put("username", "awd");

        Call<List<ItemResult>> call = endpoints.getItemListByUser(map);
        ArrayList<String> arlist = new ArrayList<>( );


        call.enqueue(new Callback<List<ItemResult>>() {
            @Override
            public void onResponse(Call<List<ItemResult>> call, Response<List<ItemResult>> response) {
                System.out.println("passssed");
                if(response.code() ==200){
                }

                List<ItemResult> it = response.body();
                String[] values = new String[it.size()];



                Itemcls[] itemcls  =  new Itemcls[it.size()];

                for(int i =0 ; i<it.size(); i++){



                    itemcls[i] =new Itemcls (it.get(i).getItemID(), it.get(i).getItem_Quantity(), it.get(i).getItem_AgreedPrice(), R.drawable.edit, R.drawable.delete);

                }

                itemAdapter adapter= new itemAdapter(itemcls,itemList.this);
                recyclerView.setAdapter(adapter);




            }

            @Override
            public void onFailure(Call<List<ItemResult>> call, Throwable t) {
                System.out.println("failed");

            }

        });




    }
    public void sendGETRequest(){



    }
}