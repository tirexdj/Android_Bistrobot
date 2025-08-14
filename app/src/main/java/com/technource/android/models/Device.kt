package com.technource.android.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Device(
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("device_identifier")
    val deviceIdentifier: String,
    @SerializedName("device_name")
    val deviceName: String?,
    @SerializedName("device_model")
    val deviceModel: String?,
    @SerializedName("device_type")
    val deviceType: DeviceType,
    @SerializedName("status")
    val status: DeviceStatus,
    @SerializedName("is_online")
    val isOnline: Boolean,
    @SerializedName("location")
    val location: String?,
    @SerializedName("capabilities")
    val capabilities: List<String>?,
    @SerializedName("last_heartbeat")
    val lastHeartbeat: String?,
    @SerializedName("registered_at")
    val registeredAt: String,
    @SerializedName("disconnected_at")
    val disconnectedAt: String?,
    @SerializedName("disconnect_reason")
    val disconnectReason: String?,
    @SerializedName("company_uuid")
    val companyUuid: String,
    @SerializedName("assigned_table")
    val assignedTable: AssignedTable?,
    @SerializedName("active_session")
    val activeSession: DeviceSession?,
    @SerializedName("timestamps")
    val timestamps: Timestamps,
    @SerializedName("configuration")
    val configuration: Map<String, Any>?
) : Serializable

data class AssignedTable(
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("number")
    val number: String,
    @SerializedName("name")
    val name: String
) : Serializable

data class Timestamps(
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String
) : Serializable
