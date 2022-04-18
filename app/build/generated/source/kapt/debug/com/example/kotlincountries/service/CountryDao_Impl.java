package com.example.kotlincountries.service;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.kotlincountries.model.Country;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CountryDao_Impl implements CountryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Country> __insertionAdapterOfCountry;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCountries;

  public CountryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCountry = new EntityInsertionAdapter<Country>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Country` (`uuid`,`name`,`region`,`capital`,`currency`,`language`,`flag`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Country value) {
        stmt.bindLong(1, value.getUuid());
        if (value.getCountryName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCountryName());
        }
        if (value.getCountryRegion() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCountryRegion());
        }
        if (value.getCountryCapital() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCountryCapital());
        }
        if (value.getCountryCurrency() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCountryCurrency());
        }
        if (value.getCountryLanguage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCountryLanguage());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getImageUrl());
        }
      }
    };
    this.__preparedStmtOfDeleteAllCountries = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM country";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final Country[] countries, final Continuation<? super List<Long>> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<List<Long>>() {
      @Override
      public List<Long> call() throws Exception {
        __db.beginTransaction();
        try {
          List<Long> _result = __insertionAdapterOfCountry.insertAndReturnIdsList(countries);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllCountries(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCountries.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllCountries.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object getAllCountries(final Continuation<? super List<Country>> p0) {
    final String _sql = "SELECT * FROM country";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Country>>() {
      @Override
      public List<Country> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUuid = CursorUtil.getColumnIndexOrThrow(_cursor, "uuid");
          final int _cursorIndexOfCountryName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCountryRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
          final int _cursorIndexOfCountryCapital = CursorUtil.getColumnIndexOrThrow(_cursor, "capital");
          final int _cursorIndexOfCountryCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfCountryLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "flag");
          final List<Country> _result = new ArrayList<Country>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Country _item;
            final String _tmpCountryName;
            _tmpCountryName = _cursor.getString(_cursorIndexOfCountryName);
            final String _tmpCountryRegion;
            _tmpCountryRegion = _cursor.getString(_cursorIndexOfCountryRegion);
            final String _tmpCountryCapital;
            _tmpCountryCapital = _cursor.getString(_cursorIndexOfCountryCapital);
            final String _tmpCountryCurrency;
            _tmpCountryCurrency = _cursor.getString(_cursorIndexOfCountryCurrency);
            final String _tmpCountryLanguage;
            _tmpCountryLanguage = _cursor.getString(_cursorIndexOfCountryLanguage);
            final String _tmpImageUrl;
            _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            _item = new Country(_tmpCountryName,_tmpCountryRegion,_tmpCountryCapital,_tmpCountryCurrency,_tmpCountryLanguage,_tmpImageUrl);
            final int _tmpUuid;
            _tmpUuid = _cursor.getInt(_cursorIndexOfUuid);
            _item.setUuid(_tmpUuid);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getCountry(final int countryId, final Continuation<? super Country> p1) {
    final String _sql = "SELECT * FROM country where uuid = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, countryId);
    return CoroutinesRoom.execute(__db, false, new Callable<Country>() {
      @Override
      public Country call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUuid = CursorUtil.getColumnIndexOrThrow(_cursor, "uuid");
          final int _cursorIndexOfCountryName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCountryRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
          final int _cursorIndexOfCountryCapital = CursorUtil.getColumnIndexOrThrow(_cursor, "capital");
          final int _cursorIndexOfCountryCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfCountryLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "flag");
          final Country _result;
          if(_cursor.moveToFirst()) {
            final String _tmpCountryName;
            _tmpCountryName = _cursor.getString(_cursorIndexOfCountryName);
            final String _tmpCountryRegion;
            _tmpCountryRegion = _cursor.getString(_cursorIndexOfCountryRegion);
            final String _tmpCountryCapital;
            _tmpCountryCapital = _cursor.getString(_cursorIndexOfCountryCapital);
            final String _tmpCountryCurrency;
            _tmpCountryCurrency = _cursor.getString(_cursorIndexOfCountryCurrency);
            final String _tmpCountryLanguage;
            _tmpCountryLanguage = _cursor.getString(_cursorIndexOfCountryLanguage);
            final String _tmpImageUrl;
            _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            _result = new Country(_tmpCountryName,_tmpCountryRegion,_tmpCountryCapital,_tmpCountryCurrency,_tmpCountryLanguage,_tmpImageUrl);
            final int _tmpUuid;
            _tmpUuid = _cursor.getInt(_cursorIndexOfUuid);
            _result.setUuid(_tmpUuid);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
