package com.dave_devs.countrieslistwithgraphql.domain

data class SimpleCountry(
    val code: String,
    val name: String,
    val emoji: String,
    val capital: String
)