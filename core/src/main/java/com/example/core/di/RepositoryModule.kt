package com.example.core.di

import com.example.core.domain.repository.InterfaceMovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module(includes = [NetworkModule::class, DatabaseModule::class])
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(movieRepository: com.example.core.data.MovieRepository): InterfaceMovieRepository

}