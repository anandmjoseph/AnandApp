package com.cv.anandmjoseph.anandapp.core.business;

import android.support.annotation.WorkerThread;

import java.io.IOException;

import okhttp3.Response;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public interface IBusiness {

    /**
     * function which will return the {@<code>Response</code>} which is obtained
     * from the request
     * @param payload the payload for the request
     * @return the Response object
     */
    @WorkerThread
    Response getResponse(final RequestPayload payload) throws IOException;
}
