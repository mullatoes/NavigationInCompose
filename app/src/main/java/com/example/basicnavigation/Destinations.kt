package com.example.basicnavigation

interface Destinations {
    val route: String
}

object Home : Destinations {
    override val route: String
        get() = "Home"
}

object MenuList : Destinations {
    override val route: String
        get() = "MenuList"
}


object DetailsScreen : Destinations {
    override val route: String
        get() = "DetailsScreen"
}

object HomeScreen : Destinations {
    override val route: String
        get() = "HomeScreen"
}