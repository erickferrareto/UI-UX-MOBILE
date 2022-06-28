package com.example.bancodedadossqlite.domainn

data class Match(
    val description: String,
    val place: Place,
    val homeTeam: Team,
    val visitTeam: Team
)
