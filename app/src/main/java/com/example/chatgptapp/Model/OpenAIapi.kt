package com.example.chatgptapp.Model

import com.example.chatgptapp.APIkey.API_KEY.MY_API_KEY
import com.example.chatgptapp.Data.CompletionRequest
import com.example.chatgptapp.Data.CompletionResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface OpenAiApi {
    @Headers("Authorization: Bearer $MY_API_KEY")
    @POST("v1/completions")
    suspend fun getCompletions(@Body completionResponse: CompletionRequest) : Response<CompletionResponse>
}