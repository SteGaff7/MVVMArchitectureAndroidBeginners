package com.example.mvvm_architecture_android_beginners.data.api

import com.example.mvvm_architecture_android_beginners.data.model.User
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single

class ApiService : IApiService {

    override fun getUsers(): Single<List<User>> {
        return Rx2AndroidNetworking.get("https://5e510330f2c0d300147c034c.mockapi.io/users")
            .build()
            .getObjectListSingle(User::class.java)
    }
}