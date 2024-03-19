package ru.easycode.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import ru.easycode.domain.LoadQuoteResult
import ru.easycode.domain.Repository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository,
    private val mapper: LoadQuoteResult.Mapper<QuoteUiState>
) : ViewModel() {

    private val innerLiveData = MutableLiveData<QuoteUiState>()
    val liveData: LiveData<QuoteUiState>
        get() = innerLiveData

    private val viewModelScope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)

    fun load() {
        viewModelScope.launch {
            val quoteResult: LoadQuoteResult = repository.loadQuote()
            val uiState: QuoteUiState = quoteResult.map(mapper)
            innerLiveData.value = uiState
        }
    }
}