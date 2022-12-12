package com.example.triviaquiz.api

import com.example.triviaquiz.model.Result
import retrofit2.Response
import retrofit2.http.GET

interface QuestionsList {
    @GET("/api.php?amount=10&category=21&difficulty=medium&type=multiple")
    suspend fun getQuestions(): Response<com.example.triviaquiz.model.Result>
}