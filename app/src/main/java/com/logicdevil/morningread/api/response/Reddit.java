package com.logicdevil.morningread.api.response;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class Reddit extends BaseResponse {
    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return "Reddit{" +
                "kind='" + kind + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reddit reddit = (Reddit) o;

        if (kind != null ? !kind.equals(reddit.kind) : reddit.kind != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return kind != null ? kind.hashCode() : 0;
    }

    String kind;
}
