package com.technource.android.models

import com.google.gson.annotations.SerializedName

enum class DeviceType {
    @SerializedName("tablet")
    TABLET,
    @SerializedName("kiosk")
    KIOSK,
    @SerializedName("display")
    DISPLAY,
    @SerializedName("printer")
    PRINTER,
    @SerializedName("pos")
    POS
}

enum class DeviceStatus {
    @SerializedName("active")
    ACTIVE,
    @SerializedName("inactive")
    INACTIVE,
    @SerializedName("maintenance")
    MAINTENANCE,
    @SerializedName("offline")
    OFFLINE,
    @SerializedName("error")
    ERROR
}
