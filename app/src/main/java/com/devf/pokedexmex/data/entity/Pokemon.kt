package com.devf.pokedexmex.data.entity

data class Pokemon(
    val id: Int = 0,
    val name: String = "",
    val order: Int = 0,
    val type: MutableList<Type> = arrayListOf()
)


//https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/