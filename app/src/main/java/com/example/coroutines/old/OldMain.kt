package com.example.coroutines.old

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.example.coroutines.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeout
import kotlin.system.measureTimeMillis

class OldMain : AppCompatActivity() {
    val TAG = "MainActivity";
    lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_old_main)
        btn = findViewById(R.id.uibtn)

        btn.setOnClickListener {
            lifecycleScope.launch {
                while(true){
                    delay(1000)
                    Log.d(TAG,"Still Running")
                }
            }
            lifecycleScope.launch {
                delay(5000)
                startActivity(Intent(this@OldMain,SecondActivity::class.java)).also {
                    finish()
                }
            }
        }

    }
}