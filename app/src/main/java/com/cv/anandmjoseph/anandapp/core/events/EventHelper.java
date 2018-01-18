package com.cv.anandmjoseph.anandapp.core.events;

/**
 * Created by Anand M Joseph on 8/11/17.
 */
public interface EventHelper {

    void addViewEvents(final EventListener listener);
    void removeViewEvents(final EventListener listener);
    void addGlobalEvents(final EventListener listener);
    void removeGlobalEvents(final EventListener listener);
}
