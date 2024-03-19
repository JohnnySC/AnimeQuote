package ru.easycode.presentation

import ru.easycode.domain.LoadQuoteResult
import javax.inject.Inject

class QuoteUiMapper @Inject constructor() : LoadQuoteResult.Mapper<QuoteUiState> {

    override fun mapSuccess(quote: String): QuoteUiState {
        return QuoteUiState.Success(quote)
    }

    override fun mapError(message: String): QuoteUiState {
        return QuoteUiState.Error(message)
    }
}