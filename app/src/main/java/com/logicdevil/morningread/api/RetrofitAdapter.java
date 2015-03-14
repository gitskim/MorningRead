package com.logicdevil.morningread.api;

import com.logicdevil.morningread.api.requests.APIRequests;
import com.logicdevil.morningread.api.models.Config;

import retrofit.RestAdapter;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class RetrofitAdapter {
    RestAdapter restAdapter = new RestAdapter.Builder()
            .setEndpoint(Config.END_POINT)
            .build();

    APIRequests service = restAdapter.create(APIRequests.class);

    public static RestAdapter buildRestAdapter() {
        return new RestAdapter.Builder()
                .setEndpoint(Config.END_POINT)
                .build();
    }
}
