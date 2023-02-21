package com.dave_devs.countrieslistwithgraphql.domain.use_cases

import com.dave_devs.countrieslistwithgraphql.domain.CountryClient
import com.dave_devs.countrieslistwithgraphql.domain.DetailedCountry

class GetCountryUseCase(
    private val countryClient: CountryClient
) {
    suspend fun execute(code: String): DetailedCountry? {
        return countryClient.getCountry(code)
    }
}