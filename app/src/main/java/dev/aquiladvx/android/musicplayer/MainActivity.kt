package dev.aquiladvx.android.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dev.aquiladvx.android.musicplayer.databinding.ActivityMainBinding
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    @Inject
    lateinit var glide: RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        glide.load("https://i.imgur.com/3gQZQYx.jpg")
            .into(binding.iv)

    }
}