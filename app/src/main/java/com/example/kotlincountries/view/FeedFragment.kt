package com.example.kotlincountries.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.kotlincountries.R
import com.example.kotlincountries.adapter.CountryAdapter
import com.example.kotlincountries.viewmodel.FeedViewModel

class FeedFragment : Fragment() {

    private lateinit var viewModel : FeedViewModel
    private val countryAdapter = CountryAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(FeedViewModel::class.java)
        viewModel.refreshData()

        val list : RecyclerView = view.findViewById(R.id.countryList)
        list.layoutManager = LinearLayoutManager(context)
        list.adapter = countryAdapter

        val countryError : TextView = requireView().findViewById(R.id.countryError)
        val countryLoading : ProgressBar = requireView().findViewById(R.id.countryLoading)
        val swipeRefreshLayout : SwipeRefreshLayout = requireView().findViewById(R.id.swipeRefreshLayout)
        swipeRefreshLayout.setOnRefreshListener {
            list.visibility = View.GONE
            countryError.visibility = View.GONE
            countryLoading.visibility = View.VISIBLE
            viewModel.refreshData()
            swipeRefreshLayout.isRefreshing = false
        }

        observeLiveData()
    }

    fun observeLiveData(){
        viewModel.countries.observe(viewLifecycleOwner, Observer { countries -> countries?.let{
              val list : RecyclerView = requireView().findViewById(R.id.countryList)
              list.visibility = View.VISIBLE
              countryAdapter.updateCountryList(countries)
            }
        })

        viewModel.countryError.observe(viewLifecycleOwner, Observer { error ->
            error?.let{
                val countryError : TextView = requireView().findViewById(R.id.countryError)

                if(it){

                    countryError.visibility = View.VISIBLE
                }
                else{
                    countryError.visibility = View.GONE
                }
            }
        })

        viewModel.countryLoading.observe(viewLifecycleOwner, Observer { loading ->
            loading?.let{
                val countryLoading : ProgressBar = requireView().findViewById(R.id.countryLoading)

                if(it){

                    countryLoading.visibility = View.VISIBLE
                }
                else{
                    countryLoading.visibility = View.GONE
                }
            }
        })

    }

}