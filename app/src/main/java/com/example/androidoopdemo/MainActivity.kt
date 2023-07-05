package com.example.androidoopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val driver = Driver("Tom", 54)
//        driver.showDetails()

        val myCar = MyCar()
        myCar.maxSpeed = 200
        myCar.start()

    }
}