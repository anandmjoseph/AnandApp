package com.cv.anandmjoseph.anandapp.product;

import android.support.v7.widget.Toolbar;

import com.cv.anandmjoseph.anandapp.R;
import com.cv.anandmjoseph.anandapp.core.activities.MVActivity;
import com.cv.anandmjoseph.anandapp.core.fragmentstack.FragmentTransaction;
import com.cv.anandmjoseph.anandapp.product.splash.SplashFragment;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public class HomeActivity extends MVActivity<HomeView> {

    /**
     * Extending fragment should override this to provide the
     * enclosing view class
     *
     * @return the enclosing view class
     */
    @Override
    protected Class<HomeView> getViewClass() {
        return HomeView.class;
    }

    /**
     * Function needs to override by the child classes to load
     * the contents and add the listeners
     */
    @Override
    protected void onBindView() {
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setLogo(R.drawable.ic_reorder_black_24dp);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if(!isRestored){
            getSupportActionBar().hide();
            showSpalshScreen();
        }
    }

    /**
     * function show the splash screen
     */
    private void showSpalshScreen(){
        final FragmentTransaction transaction = new FragmentTransaction();
        transaction.isRoot = true;
        transaction.mInAnimation = R.anim.abc_grow_fade_in_from_bottom;
        transaction.mOutAnimation =R.anim.abc_slide_out_top;
        transaction.mFrameId = R.id.container_view;
        transaction.mFragmentClass = SplashFragment.class;
        getmFragmentManager().push(transaction);
    }
}
