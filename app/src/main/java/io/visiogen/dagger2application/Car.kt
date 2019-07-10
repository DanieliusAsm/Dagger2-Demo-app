package io.visiogen.dagger2application

import android.util.Log
import javax.inject.Inject


class Car {
    lateinit var engine:Engine
    lateinit var wheels:Wheels
    val TAG = "Car";

    @Inject
    constructor(engine:Engine,wheels:Wheels){
        this.engine=engine
        this.wheels=wheels
    }

    fun drive(){
        Log.d(TAG, "Driving... ");
    }

}