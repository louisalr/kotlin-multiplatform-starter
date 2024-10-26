package com.template.multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform