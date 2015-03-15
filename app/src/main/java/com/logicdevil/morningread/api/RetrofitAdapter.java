package com.logicdevil.morningread.api;

import com.logicdevil.morningread.api.requests.APIRequests;
import com.logicdevil.morningread.api.models.Config;

import retrofit.RestAdapter;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class RetrofitAdapter {
//    APIRequests service = RestAdapter.create(APIRequests.class);

    RestAdapter restAdapter = new RestAdapter.Builder()
            .setEndpoint(Config.END_POINT)
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .build();


    public static RestAdapter buildRestAdapter() {
        return new RestAdapter.Builder()
                .setEndpoint(Config.END_POINT)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
    }
}
