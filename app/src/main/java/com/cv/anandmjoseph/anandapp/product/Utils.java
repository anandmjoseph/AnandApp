package com.cv.anandmjoseph.anandapp.product;

import android.content.Intent;

import com.cv.anandmjoseph.anandapp.api.ProductViewCompatVO;
import com.cv.anandmjoseph.anandapp.core.fragments.AtomicFragment;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public final class Utils {
    /**
     * function initiate the share intent with the
     * product content
     */
    public static final void shareProduct(final ProductViewCompatVO vo,
                                          final AtomicFragment fragment){
        final Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,  vo.getTitle() + "\n" +
                vo.getDescription() + "\n" +
                vo.getImage());
        sendIntent.setType("text/plain");
        fragment.startActivity(sendIntent);
    }
}
