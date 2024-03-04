package ru.easycode.data

import ru.easycode.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val service: AnimeQuoteService
) : Repository {

    override suspend fun loadQuote(): Pair<Boolean, String> {
        return try {
            val quote = service.animeQuote().quote
            Pair(true, quote)
        } catch (e: Exception) {
            Pair(false, e.message ?: "error")
        }
    }
}