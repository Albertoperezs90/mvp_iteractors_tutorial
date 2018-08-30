package com.tutorial.aperezsi.mvp_simple_tuto.model

import java.io.Serializable

data class Discography (val album: List<Album>) : Serializable
data class Album(val strAlbum: String, val strArtist: String, val intYearReleased: String, val strGenre: String) : Serializable