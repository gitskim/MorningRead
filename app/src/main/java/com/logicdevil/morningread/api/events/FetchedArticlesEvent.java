package com.logicdevil.morningread.api.events;

import com.logicdevil.morningread.MorningException;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class FetchedArticlesEvent extends BaseEvent{
    public FetchedArticlesEvent(boolean isSuccessful) {
        super(isSuccessful);
    }

    public FetchedArticlesEvent(MorningException error) {
        super(error);
    }
}
