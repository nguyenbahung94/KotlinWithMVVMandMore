package com.example.nbhung.demoapp.data.remote

import com.example.nbhung.demoapp.data.remote.model.SearchResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubApiService {

    @GET("/search/repositories")
    fun repoSearch(
            @Query("q") query: String,
            @Query("sort") sort: String,
            @Query("order") order: String
    ): Single<SearchResponse>
}