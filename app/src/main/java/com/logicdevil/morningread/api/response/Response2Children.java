package com.logicdevil.morningread.api.response;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class Response2Children {

    @Expose
    private Response3Data data;

    public Response3Data getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Response2Children{" +
                "data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Response2Children that = (Response2Children) o;

        if (data != null ? !data.equals(that.data) : that.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }
}
