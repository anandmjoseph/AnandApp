package com.cv.anandmjoseph.anandapp;

import com.cv.anandmjoseph.anandapp.core.APPNucleus;
import com.cv.anandmjoseph.anandapp.core.Constants;
import com.cv.anandmjoseph.anandapp.core.CoreApplication;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public class AppModule extends CoreApplication {

    DatabaseObserver mObserver = new DatabaseObserver();


    private static AppModule mModule;
    public AppModule() {
        super();
        mModule = this;
    }

    public static AppModule getModule() {
        return mModule;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        APPNucleus.init(getApplicationContext(), Constants.Environments.DEV_ENV);
        APPNucleus.initDB(mObserver);
    }
}
