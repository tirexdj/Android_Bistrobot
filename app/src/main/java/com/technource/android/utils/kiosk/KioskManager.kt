package com.technource.android.utils.kiosk

import android.app.Activity
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.view.View

class KioskManager(private val context: Context, private val activity: Activity) {

    private val devicePolicyManager =
        context.getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
    private val componentName = ComponentName(context, MyDeviceAdminReceiver::class.java)

    fun enterKioskMode() {
        if (devicePolicyManager.isDeviceOwnerApp(context.packageName)) {
            devicePolicyManager.setLockTaskPackages(componentName, arrayOf(context.packageName))
            activity.startLockTask()
        }
    }

    fun exitKioskMode() {
        if (devicePolicyManager.isDeviceOwnerApp(context.packageName)) {
            activity.stopLockTask()
        }
    }

    fun isKioskModeActive(): Boolean {
        return devicePolicyManager.isLockTaskPermitted(context.packageName)
    }

    fun setKioskMode(enable: Boolean) {
        if (enable) {
            enterKioskMode()
            hideSystemUI()
        } else {
            exitKioskMode()
            showSystemUI()
        }
    }

    private fun hideSystemUI() {
        activity.window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_FULLSCREEN
                )
    }

    private fun showSystemUI() {
        activity.window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                )
    }
}
