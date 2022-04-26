package com.example.kotlincountries.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/example/kotlincountries/viewmodel/CountryViewModel;", "Lcom/example/kotlincountries/viewmodel/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "countryLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/kotlincountries/model/Country;", "getCountryLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getDataFromRoom", "", "uuid", "", "app_debug"})
public final class CountryViewModel extends com.example.kotlincountries.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.kotlincountries.model.Country> countryLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.kotlincountries.model.Country> getCountryLiveData() {
        return null;
    }
    
    public final void getDataFromRoom(int uuid) {
    }
    
    public CountryViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}