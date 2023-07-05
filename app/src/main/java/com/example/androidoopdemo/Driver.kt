package com.example.androidoopdemo

import android.util.Log

class Driver(var name: String, credit : Int) {
    private var totalCredit = 50
    private val car = Car()

    init {
        totalCredit = totalCredit + credit
        car.maxSpeed = 160
        car.start()
    }

    fun showDetails() {
        Log.i("MyTag", "name of the driver is $name with $totalCredit credits")
    }
}