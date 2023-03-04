package com.radzhabov.onlineshop.data.network

import com.radzhabov.onlineshop.data.network.dtos.FlashSaleDTO
import retrofit2.Call
import retrofit2.http.GET

interface FlashSaleApi {
    @GET("a9ceeb6e-416d-4352-bde6-2203416576ac")
    fun getFlashSaleList(): Call<FlashSaleDTO>
}