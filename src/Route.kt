package com.r4wxii.herokuapp

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get

fun Routing.root() {
    get("/") {
        call.respondText("Hello World!", ContentType.Text.Plain)
    }
}