package com.example.coroutines.mvvm1.ui.shoppinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.coroutines.mvvm1.data.repositories.ShoppingRepository

class ShoppingVMFactory(
    private val repository: ShoppingRepository
):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }
}