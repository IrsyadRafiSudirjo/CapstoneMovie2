package com.example.core.domain.repository

import com.example.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface InterfaceMovieRepository {

    fun getAllMovie(): Flow<com.example.core.data.Resource<List<Movie>>>

    fun getFavoriteMovie(): Flow<List<Movie>>

    fun setFavoriteMovie(movie: Movie, state: Boolean)

}