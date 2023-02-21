package com.dave_devs.countrieslistwithgraphql.di

import com.apollographql.apollo3.ApolloClient
import com.dave_devs.countrieslistwithgraphql.core.Constants.SERVER_URL
import com.dave_devs.countrieslistwithgraphql.data.ApolloCountryClient
import com.dave_devs.countrieslistwithgraphql.domain.CountryClient
import com.dave_devs.countrieslistwithgraphql.domain.use_cases.GetCountriesUseCase
import com.dave_devs.countrieslistwithgraphql.domain.use_cases.GetCountryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApolloClient(): ApolloClient {
        return ApolloClient.Builder()
            .serverUrl(SERVER_URL)
            .build()
    }

    @Provides
    @Singleton
    fun provideCountryClient(apolloClient: ApolloClient): CountryClient {
        return ApolloCountryClient(apolloClient)
    }

    @Provides
    @Singleton
    fun provideCountriesUseCase(countryClient: CountryClient): GetCountriesUseCase {
        return GetCountriesUseCase(countryClient)
    }

    @Provides
    @Singleton
    fun provideCountryUseCase(countryClient: CountryClient): GetCountryUseCase {
        return GetCountryUseCase(countryClient)
    }
}