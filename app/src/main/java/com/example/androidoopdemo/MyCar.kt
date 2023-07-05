package com.example.androidoopdemo

import android.util.Log

class MyCar : Car(),SpeedController {

    override fun start() {
        Log.i("MyTag", "This is MyCar starts...Brand id is ${getBrandId()}")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun decelerate() {
        TODO("Not yet implemented")
    }
}