package com.example.requisitionandapproval;
import com.example.requisitionandapproval.model.userLogin;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Endpoints {
    @POST("/items/addItems")
    Call<Void> saveItemList(@Body HashMap<String, String> map);

//    @HTTP(method = "GET",  path = "/items/getItemsByUser", hasBody = true)
//    List<Repo> getItemListByUser(@Body HashMap<String, String> map);

    @POST("/items/getItemsByUser")
//    Call<JSONResponse> getItemListByUser(@Body HashMap<String, String> map);
    Call<List<ItemResult>> getItemListByUser(@Body HashMap<String, String> map);

    @POST("/users/userLogin")
//    Call<JSONResponse> getItemListByUser(@Body HashMap<String, String> map);
    Call<userLogin> userLogin(@Body HashMap<String, String> map);
}
