package com.example.kotlincountries.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0014\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/example/kotlincountries/adapter/CountryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/kotlincountries/adapter/CountryAdapter$CountryViewHolder;", "Lcom/example/kotlincountries/adapter/CountryClickListener;", "countryList", "Ljava/util/ArrayList;", "Lcom/example/kotlincountries/model/Country;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getCountryList", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCountryClicked", "v", "Landroid/view/View;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateCountryList", "newCountryList", "", "CountryViewHolder", "app_debug"})
public final class CountryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.kotlincountries.adapter.CountryAdapter.CountryViewHolder> implements com.example.kotlincountries.adapter.CountryClickListener {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.example.kotlincountries.model.Country> countryList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.kotlincountries.adapter.CountryAdapter.CountryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.kotlincountries.adapter.CountryAdapter.CountryViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateCountryList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kotlincountries.model.Country> newCountryList) {
    }
    
    @java.lang.Override()
    public void onCountryClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.kotlincountries.model.Country> getCountryList() {
        return null;
    }
    
    public CountryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.kotlincountries.model.Country> countryList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/example/kotlincountries/adapter/CountryAdapter$CountryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/example/kotlincountries/databinding/ItemCountyBinding;", "(Lcom/example/kotlincountries/databinding/ItemCountyBinding;)V", "getView", "()Lcom/example/kotlincountries/databinding/ItemCountyBinding;", "setView", "app_debug"})
    public static final class CountryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.kotlincountries.databinding.ItemCountyBinding view;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kotlincountries.databinding.ItemCountyBinding getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.NotNull()
        com.example.kotlincountries.databinding.ItemCountyBinding p0) {
        }
        
        public CountryViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.kotlincountries.databinding.ItemCountyBinding view) {
            super(null);
        }
    }
}