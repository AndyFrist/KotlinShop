package com.example.homelibrary.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.homelibrary.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Glide.with(this)
            .load("https://cdn2.jianshu.io/assets/default_avatar/5-33d2da32c552b8be9a0548c7a4576607.jpg")
            .into(imageHome)

    }
}
