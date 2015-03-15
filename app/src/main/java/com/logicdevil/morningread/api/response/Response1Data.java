package com.logicdevil.morningread.api.response;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class Response1Data extends BaseResponse {
    @Expose
    private List<Response2Children> children = new ArrayList<>();

    @Expose
    private String after;

    @Expose
    private String before;

    public List<Response2Children> getChildren() {
        return children;
    }

    public String getAfter() {
        return after;
    }

    public String getBefore() {
        return before;
    }

    @Override
    public String toString() {
        return "Response1Data{" +
                "children=" + children +
                ", after='" + after + '\'' +
                ", before='" + before + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Response1Data that = (Response1Data) o;

        if (after != null ? !after.equals(that.after) : that.after != null) return false;
        if (before != null ? !before.equals(that.before) : that.before != null) return false;
        if (children != null ? !children.equals(that.children) : that.children != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = children != null ? children.hashCode() : 0;
        result = 31 * result + (after != null ? after.hashCode() : 0);
        result = 31 * result + (before != null ? before.hashCode() : 0);
        return result;
    }
}
