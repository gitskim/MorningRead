package com.logicdevil.morningread.api.events;

import com.logicdevil.morningread.MorningException;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class BaseEvent {
    private boolean mIsSuccess;
    private MorningException mError;

    public BaseEvent(boolean isSuccess) {
        mIsSuccess = isSuccess;
    }

    public BaseEvent(MorningException error) {
        mIsSuccess = false;
        mError = error;
    }

    public boolean isSuccess() {
        return mIsSuccess;
    }

    public MorningException getError() {
        return mError;
    }
}
