package com.finance.application.model

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("id")
    val id: String,
    @SerializedName("message")
    val message: String
){
    data class Data(
        @SerializedName("Email")
        val email: String,
        @SerializedName("id")
        val id: String,
        @SerializedName("Id")
        val id2: Int,
        @SerializedName("Name")
        val name: String,
        @SerializedName("Token")
        val token: String
    )
}