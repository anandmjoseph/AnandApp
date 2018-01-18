package com.cv.anandmjoseph.anandapp.product;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cv.anandmjoseph.anandapp.R;
import com.cv.anandmjoseph.anandapp.core.mvp.IView;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public class HomeView implements IView {

    private View mView;

    /**
     * Return the enclosing view
     *
     * @return return the enclosing view
     */
    @Override
    public View getView() {
        return mView;
    }

    /**
     * Create the view from the id provided
     *
     * @param inflater inflater using which the view shold be inflated
     * @param parent   to which the view to be attached
     */
    @Override
    public void init(LayoutInflater inflater, ViewGroup parent) {
        mView = inflater.inflate(R.layout.activity_main, parent, false);
    }

    /**
     * To handle the back press
     *
     * @return false if not handled true if handled
     */
    @Override
    public boolean onBackPressed() {
        return false;
    }

    /**
     * function called on destroy of the view
     */
    @Override
    public void onDestroy() {
        mView = null;
    }
}
