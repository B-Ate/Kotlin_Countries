package com.example.kotlincountries.databinding;
import com.example.kotlincountries.R;
import com.example.kotlincountries.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCountryBindingImpl extends FragmentCountryBinding  {

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
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCountryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentCountryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.countryCapital.setTag(null);
        this.countryCurrency.setTag(null);
        this.countryImage.setTag(null);
        this.countryLanguage.setTag(null);
        this.countryName.setTag(null);
        this.countryRegion.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        java.lang.String countryCountryCapital = null;
        java.lang.String countryCountryLanguage = null;
        java.lang.String countryCountryCurrency = null;
        java.lang.String countryCountryName = null;
        java.lang.String countryCountryRegion = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (country != null) {
                    // read country.imageUrl
                    countryImageUrl = country.getImageUrl();
                    // read country.countryCapital
                    countryCountryCapital = country.getCountryCapital();
                    // read country.countryLanguage
                    countryCountryLanguage = country.getCountryLanguage();
                    // read country.countryCurrency
                    countryCountryCurrency = country.getCountryCurrency();
                    // read country.countryName
                    countryCountryName = country.getCountryName();
                    // read country.countryRegion
                    countryCountryRegion = country.getCountryRegion();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryCapital, countryCountryCapital);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryCurrency, countryCountryCurrency);
            com.example.kotlincountries.util.UtilKt.downloadImage(this.countryImage, countryImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryLanguage, countryCountryLanguage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryName, countryCountryName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryRegion, countryCountryRegion);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): country
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}