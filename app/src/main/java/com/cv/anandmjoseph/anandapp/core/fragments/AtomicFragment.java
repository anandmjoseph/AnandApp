package com.cv.anandmjoseph.anandapp.core.fragments;

import android.support.v4.app.Fragment;

import com.cv.anandmjoseph.anandapp.core.activities.AtomicActivity;


/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public abstract class AtomicFragment extends Fragment {

    /**
     * function returns the activity associated with the Fragment
     *
     * @return AppCompatActivity instance
     */
    protected AtomicActivity getAtomicActivity(){
        return ((AtomicActivity)getActivity());
    }

    /**
     * this allow the fragment to listen for the device back
     * press
     *
     * @return true if handled else false
     */
    public abstract boolean onBackpressed();

}
