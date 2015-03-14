package com.logicdevil.morningread.api.models;

import retrofit.RestAdapter;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class RetrofitRequest {
    RestAdapter restAdapter = new RestAdapter.Builder()
            .setEndpoint(Config.END_POINT)
            .build();

    APIRequests service = restAdapter.create(APIRequests.class);
}
