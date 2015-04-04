package com.logicdevil.morningread.api.response;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class Children extends BaseResponse {

    private ChildrenData data;

    public ChildrenData getData() {
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Children that = (Children) o;

        if (data != null ? !data.equals(that.data) : that.data != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }
}
