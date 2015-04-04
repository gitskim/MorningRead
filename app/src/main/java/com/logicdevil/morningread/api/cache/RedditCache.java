package com.logicdevil.morningread.api.cache;

import android.util.Log;

import com.logicdevil.morningread.api.response.Listing;

/**
 * Created by suhyunkim on 3/15/15.
 */
public class RedditCache {
    private static final String TAG = RedditCache.class.getSimpleName();

    private static RedditCache sInstance;

    Listing cacheList = new Listing();

    public static RedditCache getsInstance() {
        if (sInstance == null) {
            sInstance = new RedditCache();
        }
        return sInstance;
    }

    //TODO: change the for loop to for each
    public void saveRedditResponse(Listing list) {
        Log.d(TAG, "response saved");
        cacheList = list;
//        cacheList.add(list);
    }

//    public Response4Content loadResponse() {
//        Log.d(TAG, "response loading");
//        Response4Content redditContent = new Response4Content();
//        for (int i = 0; i<cacheList.get(0).getData().getChildren().size(); i++) {
//            redditContent = cacheList.get(0).getData().getChildren().get(i).getData().getContent();
//            Log.d(TAG, "the first item in teh child is: " + cacheList.get(0).getData().getChildren().get(i));
//            Log.d(TAG, "the domain in the for loop is: " + cacheList.get(0).getData().getChildren().get(i).getData().getContent().getDomain());
//
//        }
//        return redditContent;
//    }

    public Listing loadResponse() {
                Log.d(TAG, "event reddit response loading");
        return cacheList;
    }
}
