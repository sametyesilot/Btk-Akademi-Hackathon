package com.example.hediyeapp.data

import com.google.gson.annotations.SerializedName


data class GeminiRequest(
    @SerializedName("contents")
    val contents: List<GeminiContent>
)

data class GeminiContent(
    @SerializedName("parts")
    val parts: List<GeminiPart>
)

data class GeminiPart(
    @SerializedName("text")
    val text: String
)

data class GeminiResponse(
    @SerializedName("candidates")
    val candidates: List<GeminiCandidate>?
)

data class GeminiCandidate(
    @SerializedName("content")
    val content: GeminiContent?
)

data class GiftRecommendation(
    val title: String,
    val description: String,
    val price: String,
    val link: String
) 