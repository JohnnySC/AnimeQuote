package ru.easycode.animequote

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.easycode.data.AnimeQuoteService

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    fun provideService(): AnimeQuoteService =
        Retrofit.Builder().baseUrl("https://animechan.xyz/")
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(AnimeQuoteService::class.java)
}