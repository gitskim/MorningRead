package com.logicdevil.morningread.api.models;

import retrofit.http.GET;

/**
 * Created by suhyunkim on 3/14/15.
 */
public interface APIRequests {
    @GET(Constants.LISTING_TYPE_NEW)
    void fetchNewReddits(
    );
}
