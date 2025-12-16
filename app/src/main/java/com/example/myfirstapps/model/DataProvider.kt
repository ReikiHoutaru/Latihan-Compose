package com.example.myfirstapps.model

import com.example.myfirstapps.R


fun getData(): List<PokemonModel> {
    return arrayListOf(
        PokemonModel("Bullbasaur", R.drawable.bullbasaur),
        PokemonModel("Pidgy", R.drawable.pidgey),
        PokemonModel("Eeve", R.drawable.eevee),
        PokemonModel("Zubat", R.drawable.zubat),
        PokemonModel("Pikatchu}", R.drawable.pikachu),
        PokemonModel("Charmander", R.drawable.charmander),
        PokemonModel("Pokeball", R.drawable.pokeball),
        PokemonModel("Rattata", R.drawable.rattata),
        PokemonModel("Snorelax", R.drawable.snorlax),
        PokemonModel("Squirtle", R.drawable.squirtle),
    )
}