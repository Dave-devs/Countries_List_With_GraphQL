package com.dave_devs.countrieslistwithgraphql.domain.use_cases

import com.dave_devs.countrieslistwithgraphql.domain.CountryClient
import com.dave_devs.countrieslistwithgraphql.domain.SimpleCountry

class GetCountriesUseCase(
    private val countryClient: CountryClient
) {

    suspend fun execute(): List<SimpleCountry> {
        return countryClient.getCountries().sortedBy { it.name }
    }
}