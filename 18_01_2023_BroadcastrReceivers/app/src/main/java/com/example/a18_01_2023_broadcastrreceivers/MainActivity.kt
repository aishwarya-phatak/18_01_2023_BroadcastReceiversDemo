package com.example.a18_01_2023_broadcastrreceivers

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a18_01_2023_broadcastrreceivers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var myBroadCastReceivers: MyBroadCastReceivers
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegisterToBR.setOnClickListener {
            myBroadCastReceivers = MyBroadCastReceivers()
            var intentFilter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
            registerReceiver(myBroadCastReceivers,intentFilter)
        }

        binding.btnUnregisterToBR.setOnClickListener {
            unregisterReceiver(myBroadCastReceivers)
        }
    }
}