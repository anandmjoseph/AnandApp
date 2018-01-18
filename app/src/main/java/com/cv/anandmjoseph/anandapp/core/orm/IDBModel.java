package com.cv.anandmjoseph.anandapp.core.orm;

import android.database.Cursor;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public interface IDBModel {

    /**
     * function which parse the corresponding raw which
     * points to
     *
     * @param cursor the cursor obtained
     * @return the {@code java.lang.Object} itself
     */
    void parseCursor(final Cursor cursor);

}
