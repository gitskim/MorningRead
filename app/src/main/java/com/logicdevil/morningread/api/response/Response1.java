package com.logicdevil.morningread.api.response;

import java.util.List;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class Response1 extends BaseResponse {
    private String data;
    private List<Response2> response2;
    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Response1{" +
                "data='" + data + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Response1 response1 = (Response1) o;

        if (data != null ? !data.equals(response1.data) : response1.data != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }
}
