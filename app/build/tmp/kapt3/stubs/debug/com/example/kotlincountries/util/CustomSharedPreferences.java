package com.example.kotlincountries.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004\u00a8\u0006\n"}, d2 = {"Lcom/example/kotlincountries/util/CustomSharedPreferences;", "", "()V", "getTime", "", "()Ljava/lang/Long;", "saveTime", "", "time", "Companion", "app_debug"})
public final class CustomSharedPreferences {
    private static final java.lang.String PREFERENCES_TIME = "preferences_time";
    private static android.content.SharedPreferences sharedPreferences;
    private static volatile com.example.kotlincountries.util.CustomSharedPreferences instance;
    private static java.lang.Object lock;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.kotlincountries.util.CustomSharedPreferences.Companion Companion = null;
    
    public final void saveTime(long time) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTime() {
        return null;
    }
    
    public CustomSharedPreferences() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/kotlincountries/util/CustomSharedPreferences$Companion;", "", "()V", "PREFERENCES_TIME", "", "instance", "Lcom/example/kotlincountries/util/CustomSharedPreferences;", "lock", "sharedPreferences", "Landroid/content/SharedPreferences;", "invoke", "context", "Landroid/content/Context;", "makeCustomSharedPreferences", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.kotlincountries.util.CustomSharedPreferences invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.example.kotlincountries.util.CustomSharedPreferences makeCustomSharedPreferences(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}