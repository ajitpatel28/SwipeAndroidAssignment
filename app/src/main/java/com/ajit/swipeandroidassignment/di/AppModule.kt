package com.ajit.swipeandroidassignment.di

import com.ajit.swipeandroidassignment.data.repository.ProductRepository
import com.ajit.swipeandroidassignment.ui.viewmodels.ProductViewModel
import com.ajit.swipeandroidassignment.utils.RetrofitBuilder
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    // RetrofitBuilder
    single { RetrofitBuilder }

    // ProductApiService
    single { get<RetrofitBuilder>().createService() }

    // Repository
    single { ProductRepository(get()) }

    // ViewModel
    viewModel { ProductViewModel(get()) }
}