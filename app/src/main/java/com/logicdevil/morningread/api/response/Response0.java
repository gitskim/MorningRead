package com.logicdevil.morningread.api.response;

import com.google.gson.annotations.Expose;

/**
 * Created by suhyunkim on 3/15/15.
 */
public class Response0 extends BaseResponse{

    @Expose
    Response1Data data;

    public Response1Data getData() {
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

        Response0 response0 = (Response0) o;

        if (data != null ? !data.equals(response0.data) : response0.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }
}
