package com.cv.anandmjoseph.anandapp.core.orm;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public interface ICoreObjectPrimitives<T> {

    /**
     * function save the object to the db
     * either insert or update the content
     *
     * @param object the object needs to be saved
     * @return true if the transaction is successful otherwise
     * false
     */
    boolean save(final T object);

    /**
     * function delete the record from the db
     *
     * @param object needs to be removed
     * @return true if the transaction is successful otherwise
     * false
     */
    boolean delete(final T object);

}
