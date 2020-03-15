package com.example.homelibrary.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.baselibrary.activity.Baseactivity
import com.example.homelibrary.R
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : Baseactivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Glide.with(this)
            .load("https://dss1.baidu.com/70cFfyinKgQFm2e88IuM_a/forum/pic/item/adaf2edda3cc7cd9684f8ce83e01213fb80e91a5.jpg")
            .into(imageHome)

    }
}
