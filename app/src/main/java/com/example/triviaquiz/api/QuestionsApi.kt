package com.example.triviaquiz.api

import com.example.triviaquiz.model.Result
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface QuestionsApi {
//    @GET("/api.php?amount=10&category=21&difficulty=medium&type=multiple")
    @GET
    suspend fun getQuestions(@Url url: String): Response<com.example.triviaquiz.model.Result>

}