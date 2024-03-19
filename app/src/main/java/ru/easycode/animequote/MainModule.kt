package ru.easycode.animequote

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.easycode.data.RepositoryImpl
import ru.easycode.domain.LoadQuoteResult
import ru.easycode.domain.Repository
import ru.easycode.presentation.QuoteUiMapper
import ru.easycode.presentation.QuoteUiState

@Module
@InstallIn(SingletonComponent::class)
abstract class MainModule {

    @Binds
    abstract fun provideRepository(impl: RepositoryImpl) : Repository

    @Binds
    abstract fun provideMapper(mapper: QuoteUiMapper) : LoadQuoteResult.Mapper<QuoteUiState>
}