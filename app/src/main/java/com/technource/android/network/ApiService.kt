package com.technource.android.network

import com.technource.android.models.request.ConnectTabletRequest
import com.technource.android.models.response.ConnectTabletResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("/api/v1/tablet/connect")
    suspend fun connectTablet(@Body request: ConnectTabletRequest): Response<ConnectTabletResponse>
}
