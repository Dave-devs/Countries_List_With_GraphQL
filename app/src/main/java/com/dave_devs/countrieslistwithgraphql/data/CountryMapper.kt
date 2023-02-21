package com.dave_devs.countrieslistwithgraphql.data

import com.dave_devs.CountriesQuery
import com.dave_devs.CountryQuery
import com.dave_devs.countrieslistwithgraphql.domain.DetailedCountry
import com.dave_devs.countrieslistwithgraphql.domain.SimpleCountry

fun CountryQuery.Country.toDetailedCountry(): DetailedCountry {
    return DetailedCountry(
        code = code,
        name = name,
        emoji = emoji,
        capital = capital ?: "No Capital",
        currency = currency ?: "No Currency",
        languages = languages.mapNotNull {it.name},
        continent = continent.name
    )
}

fun CountriesQuery.Country.toSimpleCountry(): SimpleCountry {
    return SimpleCountry(
        code = code,
        name = name,
        emoji = emoji,
        capital = capital ?: "No Capital"
    )
}