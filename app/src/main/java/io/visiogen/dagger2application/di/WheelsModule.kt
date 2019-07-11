package io.visiogen.dagger2application.di

import dagger.Module
import dagger.Provides
import io.visiogen.dagger2application.Rims
import io.visiogen.dagger2application.Tires
import io.visiogen.dagger2application.Wheels

@Module
class WheelsModule {
    @Provides
    fun provideRims():Rims{
        return Rims()
    }

    @Provides
    fun provideTires():Tires{
        return Tires()
    }

    @Provides
    fun provideWheels(rims:Rims,tires:Tires):Wheels{
        return Wheels(rims,tires)
    }
}