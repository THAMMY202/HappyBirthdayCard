package com.example.happybirthday

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playBirthDayWishSong()
    }

    private fun playBirthDayWishSong(){
        var resId = resources.getIdentifier(R.raw.birthday_song.toString(),"raw", this?.packageName)

        val mediaPlayer = MediaPlayer.create(this, resId)
        mediaPlayer.start()
    }
}