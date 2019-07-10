package io.visiogen.dagger2application.di

import dagger.Component
import io.visiogen.dagger2application.Car

@Component
interface CarComponent {

    fun getCar():Car
}