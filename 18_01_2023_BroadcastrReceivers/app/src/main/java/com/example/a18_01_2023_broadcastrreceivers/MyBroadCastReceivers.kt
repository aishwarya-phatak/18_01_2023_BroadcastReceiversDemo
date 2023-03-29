package com.example.a18_01_2023_broadcastrreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadCastReceivers : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val mode = intent!!.getBooleanExtra("state",false)?:return
        if(mode){
            Toast.makeText(context,"AIRPLANE MODE - ON",Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context,"AIRPLANE MODE - OFF",Toast.LENGTH_LONG).show()
        }
    }
}