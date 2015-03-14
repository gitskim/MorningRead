package com.logicdevil.morningread;

import retrofit.RetrofitError;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class MorningException extends Exception {
    private int code;
    private RetrofitError mRetrofitError;

    public MorningException(RetrofitError retrofitError) {
        mRetrofitError = retrofitError;
    }

    public MorningException(String detailMessage) {
        super(detailMessage);
        code = 0;
    }

    public MorningException(String detailMessage, int code) {
        super(detailMessage);
        this.code = code;
    }

    public RetrofitError getmRetrofitError() {
        return mRetrofitError;
    }

    public int getCode() {
        return code;
    }
}
