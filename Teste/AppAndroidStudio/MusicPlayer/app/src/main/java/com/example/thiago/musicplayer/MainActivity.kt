package com.example.thiago.musicplayer

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity(), View.OnClickListener {
    var play: Button? = null
    var stop: Button? = null
    var pause: Button? = null

    var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        play = findViewById(R.id.btn_play) as Button
        stop = findViewById(R.id.btn_stop) as Button
        pause = findViewById(R.id.btn_pause) as Button

        play.let {play ->  if (play != null) {
                play.setOnClickListener(this)
            }
        }

        stop.let {stop -> if (stop != null) {
                stop.setOnClickListener(this)
            }
        }

        pause.let { pause -> if (pause != null) {
                pause.setOnClickListener(this)
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.getId()) {
            R.id.btn_play -> {
               // mediaPlayer = MediaPlayer.create(applicationContext, + ic)
                mediaPlayer.start()
            }
            R.id.btn_pause ->  ""
            R.id.btn_stop ->  ""
        }
    }

}
