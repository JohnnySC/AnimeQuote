package ru.easycode.presentation

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import com.google.android.material.textview.MaterialTextView

class QuoteTextView : MaterialTextView, ShowQuote {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    )

    override fun show(text: String) {
        setText(text)
    }

    override fun showPrimaryColor() {
        setTextColor(Color.WHITE)
    }

    override fun showErrorColor() {
        setTextColor(Color.RED)
    }
}