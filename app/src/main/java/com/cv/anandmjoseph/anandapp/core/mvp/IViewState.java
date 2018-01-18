package com.cv.anandmjoseph.anandapp.core.mvp;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public interface IViewState<VS extends ViewState> {

    /**
     * function save the sate of the view and return it
     *
     * @return the {@code ViewState} of the enclosing view of the
     * fragment
     */
    VS saveViewState();

    /**
     * function restore the state of the view
     *
     * @param viewState the view state saved
     */
    void restoreViewState(VS viewState);
}
