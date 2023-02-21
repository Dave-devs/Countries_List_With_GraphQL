package com.dave_devs.countrieslistwithgraphql.presentation

import com.dave_devs.countrieslistwithgraphql.domain.DetailedCountry
import com.dave_devs.countrieslistwithgraphql.domain.SimpleCountry

data class CountriesState(
    val countries: List<SimpleCountry> = emptyList(),
    val isLoading: Boolean = false,
    val selectedCountry: DetailedCountry? = null
)
