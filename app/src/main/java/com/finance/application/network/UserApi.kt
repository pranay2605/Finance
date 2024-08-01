package com.finance.application.network

import com.finance.application.model.LoginRequest
import com.finance.application.model.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {

    @POST("login.php")
    suspend fun loginUser(@Body loginRequest: LoginRequest): Response<LoginResponse>

    companion object {
        fun getApi(): UserApi? {
            return ApiClient.client.create(UserApi::class.java)
        }
    }
}