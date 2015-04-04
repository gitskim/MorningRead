package com.logicdevil.morningread.api.response;

import com.google.gson.annotations.Expose;

/**
 * Created by suhyunkim on 3/15/15.
 */
public class ChildrenData extends BaseResponse{


    @Expose
    private String domain;

    @Expose
    private String subreddit;

    @Expose
    private String title;

    @Expose
    private String name;

    public String getDomain() {
        return domain;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Response4Content{" +
                "domain='" + domain + '\'' +
                ", subreddit='" + subreddit + '\'' +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
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

        ChildrenData that = (ChildrenData) o;

        if (domain != null ? !domain.equals(that.domain) : that.domain != null) {
            return false;
        }
        if (name != null ? !name.equals(that.name) : that.name != null) {
            return false;
        }
        if (subreddit != null ? !subreddit.equals(that.subreddit) : that.subreddit != null) {
            return false;
        }
        if (title != null ? !title.equals(that.title) : that.title != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = domain != null ? domain.hashCode() : 0;
        result = 31 * result + (subreddit != null ? subreddit.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
