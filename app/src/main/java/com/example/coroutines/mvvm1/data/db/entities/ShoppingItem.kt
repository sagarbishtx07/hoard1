package com.example.coroutines.mvvm1.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_items")
data class ShoppingItem(
    @ColumnInfo(name = "Item Name")
    var name:String,
    @ColumnInfo(name = "item_amount")
    var amount:Int
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null
}