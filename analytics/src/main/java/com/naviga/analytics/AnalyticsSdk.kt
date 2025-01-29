package com.naviga.analytics

import android.content.Context
import android.os.Message
import android.widget.Toast

object AnalyticsSdk {

    fun toastMessage(context: Context,message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }


}