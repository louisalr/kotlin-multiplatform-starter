package com.template.multiplatform

sealed class Result<out R> {
    data class Success<out T>(val data: T) : Result<T>()
    data class GenericFailure<out T>(val cause: Throwable): Result<T>()
}