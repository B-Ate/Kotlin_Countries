package com.example.kotlincountries.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kotlincountries.R

class CountryFragmentDirections private constructor() {
  companion object {
    fun actionCountryFragmentToFeedFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_countryFragment_to_feedFragment)
  }
}
