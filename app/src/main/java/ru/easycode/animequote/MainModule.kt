package ru.easycode.animequote

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.easycode.data.RepositoryImpl
import ru.easycode.domain.Repository

@Module
@InstallIn(SingletonComponent::class)
abstract class MainModule {

    @Binds
    abstract fun provideRepository(impl: RepositoryImpl) : Repository
}