package com.example.kotlincountries.databinding;
import com.example.kotlincountries.R;
import com.example.kotlincountries.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCountyBindingImpl extends ItemCountyBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mListenerOnCountryClickedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemCountyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemCountyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.countryUuid.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.name.setTag(null);
        this.region.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.country == variableId) {
            setCountry((com.example.kotlincountries.model.Country) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.example.kotlincountries.adapter.CountryClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCountry(@Nullable com.example.kotlincountries.model.Country Country) {
        this.mCountry = Country;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.country);
        super.requestRebind();
    }
    public void setListener(@Nullable com.example.kotlincountries.adapter.CountryClickListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.kotlincountries.model.Country country = mCountry;
        java.lang.String countryImageUrl = null;
        android.view.View.OnClickListener listenerOnCountryClickedAndroidViewViewOnClickListener = null;
        int CountryUuid1 = 0;
        java.lang.String stringValueOfCountryUuid = null;
        com.example.kotlincountries.adapter.CountryClickListener listener = mListener;
        java.lang.String countryCountryName = null;
        java.lang.String countryCountryRegion = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (country != null) {
                    // read country.imageUrl
                    countryImageUrl = country.getImageUrl();
                    // read country.uuid
                    CountryUuid1 = country.getUuid();
                    // read country.countryName
                    countryCountryName = country.getCountryName();
                    // read country.countryRegion
                    countryCountryRegion = country.getCountryRegion();
                }


                // read String.valueOf(country.uuid)
                stringValueOfCountryUuid = java.lang.String.valueOf(CountryUuid1);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (listener != null) {
                    // read listener::onCountryClicked
                    listenerOnCountryClickedAndroidViewViewOnClickListener = (((mListenerOnCountryClickedAndroidViewViewOnClickListener == null) ? (mListenerOnCountryClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mListenerOnCountryClickedAndroidViewViewOnClickListener).setValue(listener));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryUuid, stringValueOfCountryUuid);
            com.example.kotlincountries.util.UtilKt.downloadImage(this.imageView, countryImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, countryCountryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.region, countryCountryRegion);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(listenerOnCountryClickedAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.kotlincountries.adapter.CountryClickListener value;
        public OnClickListenerImpl setValue(com.example.kotlincountries.adapter.CountryClickListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onCountryClicked(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): country
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}