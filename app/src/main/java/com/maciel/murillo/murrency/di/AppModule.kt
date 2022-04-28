package com.maciel.murillo.murrency.di

import com.maciel.murillo.murrency.model.MurrencyApi
import com.maciel.murillo.murrency.model.Repository
import com.maciel.murillo.murrency.model.RepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ViewModelComponent::class)
interface AppModule {

    @Binds
    fun bindRepository(repositoryImpl: RepositoryImpl): Repository

    companion object {
        @Provides
        fun providesRetrofit(): MurrencyApi {
            return Retrofit.Builder()
                .baseUrl("https://api.frankfurter.app")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MurrencyApi::class.java)
        }
    }
}