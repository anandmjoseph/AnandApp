package com.cv.anandmjoseph.anandapp.core.activities;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.cv.anandmjoseph.anandapp.core.fragments.AtomicFragment;
import com.cv.anandmjoseph.anandapp.core.fragmentstack.FragmentManager;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public class AtomicActivity extends AppCompatActivity {

    private FragmentManager mFragmentManager;

    protected boolean isRestored;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        isRestored = (savedInstanceState != null);
        super.onCreate(savedInstanceState);
        mFragmentManager = new FragmentManager(getSupportFragmentManager());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
    @Override
    public void onBackPressed() {
        final int count = getSupportFragmentManager().getBackStackEntryCount();
        if(count > 0) {
            final AtomicFragment fragment = mFragmentManager.getFragmentAt(count - 1);
            if (fragment != null && !fragment.onBackpressed()) {
                if (!mFragmentManager.pop()) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        finishAfterTransition();
                    } else super.onBackPressed();
                }
                if(count == 1){
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        finishAfterTransition();
                    } else super.onBackPressed();
                }
            }
        }else{
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                finishAfterTransition();
            } else super.onBackPressed();
        }
    }

    /**
     * getter function for mFragmentManager
     *
     * @return FragmentManager instance associated with the AtomicActivity
     */
    public final FragmentManager getmFragmentManager(){
        return mFragmentManager;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mFragmentManager.dumb();
        mFragmentManager = null;
    }
}
