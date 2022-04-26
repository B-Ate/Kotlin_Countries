// Generated by data binding compiler. Do not edit!
package com.example.kotlincountries.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.kotlincountries.R;
import com.example.kotlincountries.model.Country;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCountyBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView region;

  @Bindable
  protected Country mCountry;

  protected ItemCountyBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView, TextView name, TextView region) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.name = name;
    this.region = region;
  }

  public abstract void setCountry(@Nullable Country country);

  @Nullable
  public Country getCountry() {
    return mCountry;
  }

  @NonNull
  public static ItemCountyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_county, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCountyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCountyBinding>inflateInternal(inflater, R.layout.item_county, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCountyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_county, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCountyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCountyBinding>inflateInternal(inflater, R.layout.item_county, null, false, component);
  }

  public static ItemCountyBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemCountyBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCountyBinding)bind(component, view, R.layout.item_county);
  }
}
