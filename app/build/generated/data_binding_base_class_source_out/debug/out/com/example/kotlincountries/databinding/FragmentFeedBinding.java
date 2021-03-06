// Generated by data binding compiler. Do not edit!
package com.example.kotlincountries.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.example.kotlincountries.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentFeedBinding extends ViewDataBinding {
  @NonNull
  public final TextView countryError;

  @NonNull
  public final RecyclerView countryList;

  @NonNull
  public final ProgressBar countryLoading;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  protected FragmentFeedBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView countryError, RecyclerView countryList, ProgressBar countryLoading,
      SwipeRefreshLayout swipeRefreshLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.countryError = countryError;
    this.countryList = countryList;
    this.countryLoading = countryLoading;
    this.swipeRefreshLayout = swipeRefreshLayout;
  }

  @NonNull
  public static FragmentFeedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_feed, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFeedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFeedBinding>inflateInternal(inflater, R.layout.fragment_feed, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFeedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_feed, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFeedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFeedBinding>inflateInternal(inflater, R.layout.fragment_feed, null, false, component);
  }

  public static FragmentFeedBinding bind(@NonNull View view) {
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
  public static FragmentFeedBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFeedBinding)bind(component, view, R.layout.fragment_feed);
  }
}
