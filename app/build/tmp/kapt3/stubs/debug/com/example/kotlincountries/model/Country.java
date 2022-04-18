package com.example.kotlincountries.model;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/example/kotlincountries/model/Country;", "", "countryName", "", "countryRegion", "countryCapital", "countryCurrency", "countryLanguage", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCapital", "()Ljava/lang/String;", "getCountryCurrency", "getCountryLanguage", "getCountryName", "getCountryRegion", "getImageUrl", "uuid", "", "getUuid", "()I", "setUuid", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Country {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int uuid = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "name")
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String countryName = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "region")
    @com.google.gson.annotations.SerializedName(value = "region")
    private final java.lang.String countryRegion = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "capital")
    @com.google.gson.annotations.SerializedName(value = "capital")
    private final java.lang.String countryCapital = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "currency")
    @com.google.gson.annotations.SerializedName(value = "currency")
    private final java.lang.String countryCurrency = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "language")
    @com.google.gson.annotations.SerializedName(value = "language")
    private final java.lang.String countryLanguage = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "flag")
    @com.google.gson.annotations.SerializedName(value = "flag")
    private final java.lang.String imageUrl = null;
    
    public final int getUuid() {
        return 0;
    }
    
    public final void setUuid(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryCapital() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    public Country(@org.jetbrains.annotations.Nullable()
    java.lang.String countryName, @org.jetbrains.annotations.Nullable()
    java.lang.String countryRegion, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCapital, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCurrency, @org.jetbrains.annotations.Nullable()
    java.lang.String countryLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.kotlincountries.model.Country copy(@org.jetbrains.annotations.Nullable()
    java.lang.String countryName, @org.jetbrains.annotations.Nullable()
    java.lang.String countryRegion, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCapital, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCurrency, @org.jetbrains.annotations.Nullable()
    java.lang.String countryLanguage, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}