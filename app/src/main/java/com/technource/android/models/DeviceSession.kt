package com.technource.android.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DeviceSession(
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("device_uuid")
    val deviceUuid: String,
    @SerializedName("operator_user_uuid")
    val operatorUserUuid: String?,
    @SerializedName("session_token")
    val sessionToken: String,
    @SerializedName("metadata")
    val metadata: Map<String, Any>?,
    @SerializedName("started_at")
    val startedAt: String,
    @SerializedName("ended_at")
    val endedAt: String?,
    @SerializedName("end_reason")
    val endReason: String?,
    @SerializedName("last_activity_at")
    val lastActivityAt: String
) : Serializable
