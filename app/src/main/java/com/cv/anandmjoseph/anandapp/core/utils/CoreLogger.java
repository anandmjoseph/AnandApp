package com.cv.anandmjoseph.anandapp.core.utils;

import android.util.Log;

import com.cv.anandmjoseph.anandapp.core.APPNucleus;


/**
 * Created by Anand M Joseph on 8/9/17.
 * Logger responsible for logging all
 */
public final class CoreLogger {

    /**
     * Constructs a new instance of {@code Object}.
     */
    private CoreLogger() {
        super();
    }


    /**
     * function load the message to the stack trace
     *
     * @param tag the tag to be appended against the message
     * @param message the message to be logged
     */
    public static final void log(final String tag, String message){
        Log.d(tag, message);
    }

    /**
     * function load the message to the stack trace, This log the message if the app
     * in debug mode
     *
     * @param tag the tag to be appended against the message
     * @param message the message to be logged
     */
    public static final void d(final String tag, String message){
        if(APPNucleus.isDebug())
            Log.d(tag, message);
    }

    /**
     * function load the message to the stack trace, This log the message if the app
     * in debug mode
     *
     * @param tag the tag to be appended against the message
     * @param message the message to be logged
     */
    public static final void i(final String tag, String message){
        if(APPNucleus.isDebug())
            Log.i(tag, message);
    }


}
