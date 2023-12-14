package com.example.coroutines.mvvm1.ui.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.coroutines.R
import com.example.coroutines.mvvm1.data.db.ShoppingDatabase
import com.example.coroutines.mvvm1.data.repositories.ShoppingRepository

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val database = ShoppingDatabase(this)
        val repository = ShoppingRepository(database as ShoppingDatabase)
        val factory = ShoppingVMFactory(repository)
        val viewModel = ViewModelProvider(this,factory).get(ShoppingViewModel::class.java)
    }
}