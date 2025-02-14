package com.example.expmdmfebrero4.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.expmdmfebrero4.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val fragment = AlbumFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        }
    }
}