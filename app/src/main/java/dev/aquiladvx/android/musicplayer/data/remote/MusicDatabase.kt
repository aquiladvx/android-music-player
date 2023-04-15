package dev.aquiladvx.android.musicplayer.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import dev.aquiladvx.android.musicplayer.Constants.SONGS_COLLECTION
import dev.aquiladvx.android.musicplayer.data.entities.Song
import kotlinx.coroutines.tasks.await

class MusicDatabase {

    private val firestore = FirebaseFirestore.getInstance()
    private val songsCollection = firestore.collection(SONGS_COLLECTION)

    suspend fun getAllSongs(): List<Song> {
        return try {
            songsCollection.get().await().toObjects(Song::class.java)
        } catch (e: Exception) {
            emptyList()
        }
    }
}