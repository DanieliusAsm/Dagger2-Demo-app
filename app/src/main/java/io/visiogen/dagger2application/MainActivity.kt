package io.visiogen.dagger2application

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.visiogen.dagger2application.di.CarComponent
import io.visiogen.dagger2application.di.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component:CarComponent = DaggerCarComponent.create()
        val car:Car = component.getCar()
        car.drive()
    }
}
