package com.cv.anandmjoseph.anandapp.core.orm;



/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public class ORMModule {
    /**
     * function creates the query and return it
     *
     * @param className the class name
     * @return the created instance of {@code Query}
     */
    public Query getQuery(final String className){
        return new Query(className);
    }

}
