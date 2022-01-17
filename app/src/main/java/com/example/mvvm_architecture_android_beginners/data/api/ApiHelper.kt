package com.example.mvvm_architecture_android_beginners.data.api

// Data source

class ApiHelper(private val apiService: IApiService) {

    fun getUsers() = apiService.getUsers()
}