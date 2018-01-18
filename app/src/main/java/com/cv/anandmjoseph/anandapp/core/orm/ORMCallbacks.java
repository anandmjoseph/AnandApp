package com.cv.anandmjoseph.anandapp.core.orm;

import java.util.List;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public final class ORMCallbacks {



    /**
     * Interface holds the delegate methods to notify
     * the listener about the save status
     */
    public static interface SaveAllCallBack<T>{
        /**
         * function which will be called on save of all the objects
         * @param result the reference to all saved objects
         */
        void onSave(List<T> result);
    }

    /**
     * Interface holds delegate method to notify the listeners about the
     * delete status
     */
    public static interface DeleteCallBack {
        /**
         *
         * @param exception exception raised against delete operation
         */
        void onDelete(Exceptions.DeleteException exception);
    }


    /**
     * Callback to listen for the query load
     * #onLoad method will be called on load of the content
     */
    public static interface QueryCallback<T>{
        /**
         * Delegate method to be called on completion of the query
         *
         * @param list the lsit of object fetched from database
         * @param error the error raised against the query
         */
        void onLoad(List<T> list, Exceptions.QueryException error);
    }
}
