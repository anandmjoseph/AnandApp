package com.cv.anandmjoseph.anandapp.product.details;

import com.cv.anandmjoseph.anandapp.AppModule;
import com.cv.anandmjoseph.anandapp.api.ProductDBHrlper;
import com.cv.anandmjoseph.anandapp.api.ProductViewCompatVO;
import com.cv.anandmjoseph.anandapp.core.Constants;
import com.cv.anandmjoseph.anandapp.core.events.Event;
import com.cv.anandmjoseph.anandapp.core.events.EventListener;
import com.cv.anandmjoseph.anandapp.core.fragments.MVFragment;
import com.cv.anandmjoseph.anandapp.product.Utils;
import com.cv.anandmjoseph.anandapp.product.list.ProductsAdapter;

/**
 * Created by Anand M Joseph on 6/11/2017.
 */
public class ProductDetailsFragment extends MVFragment<ProductDetailsView>
implements EventListener{

    /**
     * Extending fragment should override this to provide the
     * enclosing view class
     *
     * @return the enclosing view class
     */
    @Override
    protected Class<ProductDetailsView> getViewClass() {
        return ProductDetailsView.class;
    }

    ProductViewCompatVO product;
    /**
     * Function needs to override by the child classes to load
     * the contents and add the listeners
     */
    @Override
    protected void onBindView() {
        product = getArguments().getParcelable(Constants.DATA);
        if(product.getIsRead() == 0){
            ProductDBHrlper.markAsRead(product);
        }
        mView.updateView(product);
        AppModule.getModule().addEventListener(ProductsAdapter.FAVORITE_EVENT, this);
        AppModule.getModule().addEventListener(ProductsAdapter.SHARE_EVENT, this);
    }

    /**
     * @see #onDestroyView()
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        AppModule.getModule().removeEventListener(ProductsAdapter.FAVORITE_EVENT, this);
        AppModule.getModule().removeEventListener(ProductsAdapter.SHARE_EVENT, this);
    }

    /**
     * this allow the fragment to listen for the device back
     * press
     *
     * @return true if handled else false
     */
    @Override
    public boolean onBackpressed() {
        return false;
    }

    /**
     * @see EventListener#onEvent(Event)
     */
    @Override
    public void onEvent(Event event) {
        if(event.getType().equals(ProductsAdapter.FAVORITE_EVENT)){
            if(ProductDBHrlper.toggleFavorite(product)){
                mView.updateFavorite(product.getFavoriteColor());
            }
        }else {
            Utils.shareProduct(product, this);
        }
    }
}
