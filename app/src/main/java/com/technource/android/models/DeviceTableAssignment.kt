package com.technource.android.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DeviceTableAssignment(
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("device_uuid")
    val deviceUuid: String,
    @SerializedName("table_uuid")
    val tableUuid: String,
    @SerializedName("assignment_type")
    val assignmentType: String, // 'permanent', 'temporary', 'session'
    @SerializedName("assigned_at")
    val assignedAt: String,
    @SerializedName("released_at")
    val releasedAt: String?,
    @SerializedName("assigned_by_user_uuid")
    val assignedByUserUuid: String?,
    @SerializedName("configuration")
    val configuration: Map<String, Any>?
) : Serializable
