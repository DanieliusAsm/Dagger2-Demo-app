package io.visiogen.dagger2application.di

import dagger.Component
import io.visiogen.dagger2application.Car
import io.visiogen.dagger2application.MainActivity

@Component (modules = arrayOf(WheelsModule::class))
interface CarComponent {

    fun getCar():Car

    fun inject(mainActivity:MainActivity)
}