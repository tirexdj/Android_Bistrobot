package com.technource.android.models.response

import com.google.gson.annotations.SerializedName
import com.technource.android.models.Device
import java.io.Serializable

data class ConnectTabletResponse(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("data")
    val data: ConnectTabletData?,
    @SerializedName("message")
    val message: String?
) : Serializable

data class ConnectTabletData(
    @SerializedName("tablet")
    val tablet: Device,
    @SerializedName("token")
    val token: String,
    @SerializedName("expires_at")
    val expiresAt: String?,
    @SerializedName("company")
    val company: Company
) : Serializable

data class Company(
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("code")
    val code: String,
    @SerializedName("settings")
    val settings: Map<String, Any>
) : Serializable
