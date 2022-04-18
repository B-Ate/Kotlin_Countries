package com.example.kotlincountries.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.kotlincountries.model.Country

@Dao
interface CountryDao {

    //Data Access Object

    @Insert
    suspend fun insertAll(vararg countries : Country) : List<Long>

    //Insert > Insert into
    // suspend > coroutine, pause & resume
    // vararg > multiple country objects
    // List<Long> primarykey döndürüyor

     @Query(value = "SELECT * FROM country")
     suspend fun getAllCountries() : List<Country>

     @Query(value = "SELECT * FROM country where uuid = :countryId")
     suspend fun getCountry(countryId : Int) : Country

    @Query(value = "DELETE FROM country")
    suspend fun deleteAllCountries()
}