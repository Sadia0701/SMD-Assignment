package com.example.booknest

class Screen {
    sealed class Screen(val route: String) {
        object Login : Screen("login")
        object Home : Screen("home")
        object BookDetail : Screen("bookDetail")
    }
}