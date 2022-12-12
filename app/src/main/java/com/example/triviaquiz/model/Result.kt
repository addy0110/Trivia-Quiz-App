package com.example.triviaquiz.model

data class Result(
    val response_code: Int,
    val results: List<Question>
)