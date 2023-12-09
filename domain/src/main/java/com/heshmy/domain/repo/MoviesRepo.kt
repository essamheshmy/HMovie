package com.heshmy.domain.repo

import com.heshmy.domain.entity.MoviesResponse


interface MoviesRepo {
    fun getMoviesFromRemote(): MoviesResponse
}