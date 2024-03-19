package ru.easycode.presentation

interface QuoteUiState {

    fun show(textView: ShowQuote)

    data class Success(private val text: String) : QuoteUiState {
        override fun show(textView: ShowQuote) {
            textView.show(text)
            textView.showPrimaryColor()
        }
    }

    data class Error(private val message: String) : QuoteUiState {
        override fun show(textView: ShowQuote) {
            textView.show(message)
            textView.showErrorColor()
        }
    }
}

interface ShowQuote {

    fun show(text: String)

    fun showPrimaryColor()

    fun showErrorColor()
}