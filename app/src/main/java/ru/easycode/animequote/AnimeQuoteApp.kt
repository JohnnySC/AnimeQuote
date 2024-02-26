package ru.easycode.animequote

import android.app.Application
import ru.easycode.data.RepositoryImpl
import ru.easycode.domain.Repository
import ru.easycode.presentation.MainViewModel
import ru.easycode.presentation.ProvideViewModel

class AnimeQuoteApp : Application(), ProvideViewModel {

    private lateinit var viewModel: MainViewModel

    override fun onCreate() {
        super.onCreate()
        val repository: Repository = RepositoryImpl()
        viewModel = MainViewModel(repository = repository)
    }

    override fun viewModel(): MainViewModel {
        return viewModel
    }
}