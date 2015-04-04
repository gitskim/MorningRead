package com.logicdevil.morningread.api.response;

import com.google.gson.annotations.Expose;

/**
 * Created by suhyunkim on 3/15/15.
 */
public class Listing extends BaseResponse{

    @Expose
    Data data;

    public Data getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Response0{" +
                "data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Listing listing = (Listing) o;

        if (data != null ? !data.equals(listing.data) : listing.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }
}
