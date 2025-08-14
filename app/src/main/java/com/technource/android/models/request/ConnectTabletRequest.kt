package com.technource.android.models.request

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ConnectTabletRequest(
    @SerializedName("company_code")
    val companyCode: String,
    @SerializedName("tablet_code")
    val tabletCode: String,
    @SerializedName("pin")
    val pin: String,
    @SerializedName("device_info")
    val deviceInfo: DeviceInfo
) : Serializable

data class DeviceInfo(
    @SerializedName("screen_resolution")
    val screenResolution: String?,
    @SerializedName("browser")
    val browser: String?,
    @SerializedName("os")
    val os: String?,
    @SerializedName("user_agent")
    val userAgent: String?,
    @SerializedName("platform")
    val platform: String?
) : Serializable
