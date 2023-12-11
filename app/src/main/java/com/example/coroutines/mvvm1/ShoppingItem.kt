package com.example.coroutines.mvvm1

import androidx.room.Entity

@Entity(tableName = "shopping_items")
data class ShoppingItem(
    var name:String,
    var amount:Int
)