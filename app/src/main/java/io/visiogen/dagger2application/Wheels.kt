package io.visiogen.dagger2application

import javax.inject.Inject

class Wheels {
    //we dont own this and rims and tires.so we cant use @Inject
    //pretend like these classes come from third party

    lateinit var rims: Rims
    lateinit var tires: Tires

    constructor(rims:Rims,tires:Tires){}
}