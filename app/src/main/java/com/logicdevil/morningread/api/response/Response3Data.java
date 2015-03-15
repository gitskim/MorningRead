package com.logicdevil.morningread.api.response;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by suhyunkim on 3/15/15.
 */
public class Response3Data {

    @Expose
    private Response4Content content;

    public Response4Content getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Response3Data{" +
                "content=" + content +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Response3Data that = (Response3Data) o;

        if (content != null ? !content.equals(that.content) : that.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return content != null ? content.hashCode() : 0;
    }
}
