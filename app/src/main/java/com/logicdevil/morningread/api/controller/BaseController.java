package com.logicdevil.morningread.api.controller;

import com.logicdevil.morningread.api.requests.APIRequests;
import com.logicdevil.morningread.api.RetrofitAdapter;

import de.greenrobot.event.EventBus;

/**
 * Created by suhyunkim on 3/14/15.
 */
public class BaseController {
    protected final EventBus mEventBus = EventBus.getDefault();

    public BaseController() {

    }

    protected APIRequests getAPIRequest() {
        return RetrofitAdapter.buildRestAdapter().create(APIRequests.class);
    }
}
