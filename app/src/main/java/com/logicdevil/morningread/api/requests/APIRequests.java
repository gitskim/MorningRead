package com.logicdevil.morningread.api.requests;

import com.logicdevil.morningread.api.response.Response1;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by suhyunkim on 3/14/15.
 */
public interface APIRequests {
    @GET("/.json")
    void fetchNewReddits(
            Callback<Response1> cb);
}
