package com.example.melibrary.Activity

import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.baselibrary.activity.Baseactivity
import com.example.melibrary.R
import kotlinx.android.synthetic.main.activity_me.*

class MeActivity : Baseactivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_me)
        Glide.with(this)
            .load("https://cdn2.jianshu.io/assets/default_avatar/5-33d2da32c552b8be9a0548c7a4576607.jpg")
            .into(imageMe)
    }
}
