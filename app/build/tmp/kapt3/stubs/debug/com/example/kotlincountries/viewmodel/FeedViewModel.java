package com.example.kotlincountries.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0014J\u0006\u0010\u001c\u001a\u00020\u0019J\u0006\u0010\u001d\u001a\u00020\u0019J\u0016\u0010\u001e\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010 \u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/kotlincountries/viewmodel/FeedViewModel;", "Lcom/example/kotlincountries/viewmodel/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "countries", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/kotlincountries/model/Country;", "getCountries", "()Landroidx/lifecycle/MutableLiveData;", "countryAPIService", "Lcom/example/kotlincountries/service/CountryAPIService;", "countryError", "", "getCountryError", "countryLoading", "getCountryLoading", "customPreferences", "Lcom/example/kotlincountries/util/CustomSharedPreferences;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "refreshTime", "", "getDataFromAPI", "", "getDataFromSQLite", "onCleared", "refreshData", "refreshFromAPI", "showCountries", "countryList", "storeInSQLite", "app_debug"})
public final class FeedViewModel extends com.example.kotlincountries.viewmodel.BaseViewModel {
    private final com.example.kotlincountries.service.CountryAPIService countryAPIService = null;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final com.example.kotlincountries.util.CustomSharedPreferences customPreferences = null;
    private long refreshTime = 600000000000L;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kotlincountries.model.Country>> countries = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> countryError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> countryLoading = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.kotlincountries.model.Country>> getCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCountryError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCountryLoading() {
        return null;
    }
    
    public final void refreshData() {
    }
    
    public final void refreshFromAPI() {
    }
    
    private final void getDataFromSQLite() {
    }
    
    private final void getDataFromAPI() {
    }
    
    private final void showCountries(java.util.List<com.example.kotlincountries.model.Country> countryList) {
    }
    
    private final void storeInSQLite(java.util.List<com.example.kotlincountries.model.Country> countryList) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public FeedViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}