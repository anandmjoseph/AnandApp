package com.cv.anandmjoseph.anandapp.core.mvp;

import android.app.Activity;
import android.support.annotation.UiThread;
import android.support.v4.app.Fragment;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public interface IPresenter<V extends IView> {

    /**
     * function to be called to set the view
     *
     * @param view the view associated with the presenter
     */
    @UiThread
    void takeView(final V view);


    /**
     * function release the view from the presenter there by blocking
     * all updates to the view. Possible call from {@link Activity#onDetachedFromWindow()} or
     * {@link Fragment#onDestroyView()}
     */
    @UiThread
    void releaseView();

    /**
     * function which will be called {@link Activity#onDestroy()} or
     * {@link Fragment#onDestroy()}
     */
    void onDestroy();

}
