package com.example.kotlincountries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlincountries.model.Country

class CountryViewModel : ViewModel() {

    val countryLiveData = MutableLiveData<Country>()

    fun getDataFromRoom(){
        val country = Country(countryName = "Turkey", countryRegion = "Asia", countryCapital = "Ankara",countryCurrency = "Lira",countryLanguage = "Turkish", imageUrl = null)
        countryLiveData.value = country
    }

}