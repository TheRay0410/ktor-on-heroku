package com.r4wxii.herokuapp

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.post

fun Routing.root() {
    val themeController = ThemeController()
    post("/CircleLine") {
        call.respondText(themeController.themeResponse(), ContentType.Text.Plain)
    }
}