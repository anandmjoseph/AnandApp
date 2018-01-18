package com.cv.anandmjoseph.anandapp.product.splash;

import com.cv.anandmjoseph.anandapp.core.Constants;
import com.cv.anandmjoseph.anandapp.core.events.CoreEvent;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public class ErrorEvent extends CoreEvent {

    Constants.ErrorCodes errorCode;
    /**
     * Constructs a new instance of {@code Object}.
     *
     * @param type   the type of th event
     */
    public ErrorEvent(String type, Constants.ErrorCodes code) {
        super(type, null);
        errorCode = code;
    }

    public Constants.ErrorCodes getErrorCode() {
        return errorCode;
    }
}
