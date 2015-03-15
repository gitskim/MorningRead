package com.logicdevil.morningread.api.controller;

import android.util.Log;

import com.logicdevil.morningread.api.cache.RedditCache;
import com.logicdevil.morningread.api.events.FetchedArticlesEvent;
import com.logicdevil.morningread.api.response.Response0;
import com.logicdevil.morningread.api.response.Response1Data;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class RedditController extends BaseController {
    private static final String TAG = RedditController.class.getSimpleName();
    private static RedditController sInstance;
    private static RedditCache sRedditCache = RedditCache.getsInstance();

    public static RedditController getsInstance() {
        if (sInstance == null) {
            sInstance = new RedditController();
        }
        return sInstance;
    }

    public void fetchRedditArticles() {
        Log.d(TAG, "reddit fetch ran");

        getAPIRequest().fetchNewReddits(new Callback<Response0>() {

            @Override
            public void success(Response0 reddit, Response response) {
                Log.d(TAG, "reddit fetch success");
                mEventBus.post(new FetchedArticlesEvent(true));
                sRedditCache.saveRedditResponse(reddit);
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(TAG, "reddit fetch not success");
            }
        });
    }
}
