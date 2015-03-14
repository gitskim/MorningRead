package com.logicdevil.morningread.api.controller;

import android.util.Log;

import com.logicdevil.morningread.api.response.Reddit;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class RedditController extends BaseController {
    private static final String TAG = RedditController.class.getSimpleName();
    private static RedditController sInstance;

    public static RedditController getsInstance() {
        if (sInstance == null) {
            sInstance = new RedditController();
        }
        return sInstance;
    }

    public void fetchRedditArticles() {
        Log.d(TAG, "reddit fetch ran");

        getAPIRequest().fetchNewReddits(new Callback<Reddit>() {

            @Override
            public void success(Reddit reddit, Response response) {
                Log.d(TAG, "reddit fetch success");
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(TAG, "reddit fetch not success");
            }
        });
    }
}
