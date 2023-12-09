package com.heshmy.domain.usecase


import com.heshmy.domain.repo.MoviesRepo

class GetMovies(private val mealsRepo:MoviesRepo) {
    suspend operator fun invoke()= mealsRepo.getMoviesFromRemote()
}