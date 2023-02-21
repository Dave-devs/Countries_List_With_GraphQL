package com.dave_devs.countrieslistwithgraphql.data

import com.apollographql.apollo3.ApolloClient
import com.dave_devs.CountriesQuery
import com.dave_devs.CountryQuery
import com.dave_devs.countrieslistwithgraphql.domain.CountryClient
import com.dave_devs.countrieslistwithgraphql.domain.DetailedCountry
import com.dave_devs.countrieslistwithgraphql.domain.SimpleCountry

class ApolloCountryClient(
    private val apolloClient: ApolloClient
): CountryClient {
    override suspend fun getCountries(): List<SimpleCountry> {
       return apolloClient
           .query(CountriesQuery())
           .execute()
           .data
           ?.countries
           ?.map{ it.toSimpleCountry()}
           ?: emptyList()
    }

    override suspend fun getCountry(code: String): DetailedCountry? {
        return apolloClient
            .query(CountryQuery(code))
            .execute()
            .data
            ?.country
            ?.toDetailedCountry()
    }
}