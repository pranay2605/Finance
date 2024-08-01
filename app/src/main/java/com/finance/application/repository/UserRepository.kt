package com.finance.application.repository

import com.finance.application.model.LoginResponse
import com.finance.application.model.LoginRequest
import com.finance.application.network.UserApi
import retrofit2.Response

class UserRepository {

    suspend fun loginUser(username: String, password: String): Response<LoginResponse>? {
        val loginRequest = LoginRequest(username, password)
        return UserApi.getApi()?.loginUser(loginRequest)
    }
}