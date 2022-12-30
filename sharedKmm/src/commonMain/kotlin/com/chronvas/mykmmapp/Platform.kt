package com.chronvas.mykmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform