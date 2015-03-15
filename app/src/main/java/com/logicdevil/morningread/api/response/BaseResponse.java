package com.logicdevil.morningread.api.response;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class BaseResponse {
    public static <T extends BaseResponse> T buildFromJson(InputStream in, Class<T> tClass,
                                                           boolean shouldUseExposeAnnotations) {
        GsonBuilder builder = new GsonBuilder();
        if (shouldUseExposeAnnotations) {
            builder.excludeFieldsWithoutExposeAnnotation();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        JsonReader reader = new JsonReader(new BufferedReader(inputStreamReader));
        Gson gson = builder.create();
        return gson.fromJson(reader, tClass);
    }

    public static <T extends BaseResponse> ArrayList<T> buildFromJson(JSONArray jsonArray,
                                                                      Class<T> tClass, Type type) {
        ArrayList<T> results = new ArrayList<T>();
        if (jsonArray != null) {
            results = new Gson().fromJson(jsonArray.toString(), type);
        }
        return results;
    }
}
