package ru.easycode.domain

interface Repository {

    suspend fun loadQuote() : LoadQuoteResult
}