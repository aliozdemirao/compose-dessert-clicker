package com.example.dessertclicker.ui

import androidx.annotation.DrawableRes
import com.example.dessertclicker.data.Datasource.dessertList

data class DessertUiState (
    val currentDessertIndex: Int = 0,
    @DrawableRes val currentDessertImageId: Int = dessertList[currentDessertIndex].imageId,
    val currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
)