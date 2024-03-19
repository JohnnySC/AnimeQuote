package ru.easycode.domain

interface LoadQuoteResult {

    fun <T : Any> map(mapper: Mapper<T>): T

    interface Mapper<T : Any> {

        fun mapSuccess(quote: String): T

        fun mapError(message: String): T
    }

    data class Success(private val quote: String) : LoadQuoteResult {
        override fun <T : Any> map(mapper: Mapper<T>): T {
            return mapper.mapSuccess(quote)
        }
    }

    data class Error(private val message: String) : LoadQuoteResult {
        override fun <T : Any> map(mapper: Mapper<T>): T {
            return mapper.mapError(message)
        }
    }
}