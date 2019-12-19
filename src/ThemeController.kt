package com.r4wxii.herokuapp

class ThemeController {
    val block = listOf("○", "○-", "-○", "")
    fun themeResponse(): String {
        while (true){
            val response = listOf(block.random(), block.random(), block.random(), block.random()).filterNot { it.isBlank() }
            if (response.size > 2) return response.toString()
        }
    }
}