package com.cv.anandmjoseph.anandapp.core.orm;

import java.util.List;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public interface ICoreObject<T> {
    /**
     * function saves a list of passed {@code T} to the DB
     *
     * @param objects the list of items to be saved
     */
    void saveAll(final List<T> objects) throws Exception;


    /**
     * function delete all the records in the table
     * @throws Exception if the deletion fails
     */
    void deleteAll() throws Exception;
}
