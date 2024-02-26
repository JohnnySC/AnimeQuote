package ru.easycode.domain

interface Repository {

    suspend fun loadQuote() : Pair<Boolean, String>
}