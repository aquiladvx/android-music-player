package dev.aquiladvx.android.musicplayer.data.entities

import com.google.gson.annotations.SerializedName

data class Song(
    @SerializedName("title")
    val title: String,
    @SerializedName("artist")
    val artist: String,
    @SerializedName("mediaId")
    val mediaId: String,
    @SerializedName("songUrl")
    val songUrl: String,
    @SerializedName("imageUrl")
    val imageUrl: String,
)
