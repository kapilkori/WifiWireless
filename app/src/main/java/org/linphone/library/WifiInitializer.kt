package org.linphone.library

import android.content.Context
import android.util.Log
import org.linphone.LinphoneApplication

const val TAG = "WifiWirelessInitializer"

object WifiInitializer {

    fun initialize(context: Context) {
        if (!LinphoneApplication.ensureCoreExists(context)) {
            LinphoneApplication.createConfig(context)
        }

        Log.i(TAG, "getInstance: Linphone Application Core Context Created")
    }

    fun instanceExists(context: Context) = LinphoneApplication.ensureCoreExists(context)
}
