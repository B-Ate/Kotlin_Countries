package com.example.kotlincountries.view

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlincountries.R
import com.example.kotlincountries.util.downloadFromUrl
import com.example.kotlincountries.util.placeholderProgressBar
import com.example.kotlincountries.view.CountryFragmentArgs
import com.example.kotlincountries.viewmodel.CountryViewModel
import com.example.kotlincountries.viewmodel.FeedViewModel
import org.w3c.dom.Text

class CountryFragment : Fragment() {

    private lateinit var viewModel : CountryViewModel

    private var countryUuid = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            countryUuid = CountryFragmentArgs.fromBundle(it).countryUuid
        }

        viewModel = ViewModelProviders.of(this).get(CountryViewModel::class.java)
        viewModel.getDataFromRoom(countryUuid)

        observeLiveData()
    }

    private fun observeLiveData(){
        viewModel.countryLiveData.observe(viewLifecycleOwner, Observer { country ->
            country?.let{
                val countryName : TextView = requireView().findViewById(R.id.countryName)
                countryName.text = country.countryName

                val countryCapital : TextView = requireView().findViewById(R.id.countryCapital)
                countryCapital.text = country.countryCapital

                val countryCurrency : TextView = requireView().findViewById(R.id.countryCurrency)
                countryCurrency.text = country.countryCurrency

                val countryLanguage : TextView = requireView().findViewById(R.id.countryLanguage)
                countryLanguage.text = country.countryLanguage

                val countryRegion : TextView = requireView().findViewById(R.id.countryRegion)
                countryRegion.text = country.countryRegion

                val countryImage : ImageView = requireView().findViewById(R.id.countryImage)

                context?.let{
                    countryImage.downloadFromUrl(country.imageUrl, placeholderProgressBar(it))
                }
            }
        })
    }
}