package com.cv.anandmjoseph.anandapp.product.list;

import com.cv.anandmjoseph.anandapp.AppModule;
import com.cv.anandmjoseph.anandapp.core.events.EventListener;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public class EventHelper implements com.cv.anandmjoseph.anandapp.core.events.EventHelper {

    @Override
    public void addGlobalEvents(EventListener listener) {
        AppModule.getModule().addEventListener(ProductPresenter.PRODUCTS_FETCHED_EVENT,
                listener);
    }

    @Override
    public void addViewEvents(EventListener listener) {
        AppModule.getModule().addEventListener(ProductsAdapter.LAST_ITEM_REACHED,
                listener);
        AppModule.getModule().addEventListener(ProductsAdapter.FAVORITE_EVENT,
                listener);
        AppModule.getModule().addEventListener(ProductsAdapter.SHARE_EVENT,
                listener);
        AppModule.getModule().addEventListener(ProductsAdapter.ITEM_CLICK_EVENT,
                listener);
    }


    @Override
    public void removeGlobalEvents(EventListener listener) {
        AppModule.getModule().removeEventListener(ProductPresenter.PRODUCTS_FETCHED_EVENT,
                listener);
    }

    @Override
    public void removeViewEvents(EventListener listener) {
        AppModule.getModule().removeEventListener(ProductsAdapter.LAST_ITEM_REACHED,
                listener);
        AppModule.getModule().removeEventListener(ProductsAdapter.FAVORITE_EVENT,
                listener);
        AppModule.getModule().removeEventListener(ProductsAdapter.SHARE_EVENT,
                listener);
        AppModule.getModule().removeEventListener(ProductsAdapter.ITEM_CLICK_EVENT,
                listener);
    }
}
