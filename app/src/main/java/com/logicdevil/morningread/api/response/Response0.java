package com.logicdevil.morningread.api.response;

import com.google.gson.annotations.Expose;

/**
 * Created by suhyunkim on 3/15/15.
 */
public class Response0 {
    @Expose
    Response1Data data;

    public Response1Data getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Response0Listing{" +
                "data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Response0 that = (Response0) o;

        if (data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }
}
