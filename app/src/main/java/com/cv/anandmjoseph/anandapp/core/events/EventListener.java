package com.cv.anandmjoseph.anandapp.core.events;

/**
 * Created by Anand M Joseph on 8/11/17.
 */
public interface EventListener {

    /**
     * Delegate method which will be called against respective events
     * @param event the event which is dispatched by the {@link Dispatcher}
     */
    void onEvent(Event event);

}
