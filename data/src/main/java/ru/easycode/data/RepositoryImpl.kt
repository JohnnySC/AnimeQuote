package ru.easycode.data

import ru.easycode.domain.LoadQuoteResult
import ru.easycode.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val service: AnimeQuoteService
) : Repository {

    override suspend fun loadQuote(): LoadQuoteResult {
        return try {
            val quote = service.animeQuote().quote
            LoadQuoteResult.Success(quote)
        } catch (e: Exception) {
            LoadQuoteResult.Error(e.message ?: "error")
        }
    }
}