package ru.easycode.data

import com.google.gson.annotations.SerializedName

/*
{"id":4501,"quote":"You should cry while you still can. When you get bigger, sometimes, you can't cry even if you have something you wanna cry about.","anime":"CLANNAD","character":"Okazaki Tomoya"}
 */
data class AnimeQuoteCloud(
    @SerializedName("quote")
    val quote: String
)