package org.kwala.assigment

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform