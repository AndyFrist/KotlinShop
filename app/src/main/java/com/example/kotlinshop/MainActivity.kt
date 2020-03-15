package com.example.kotlinshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import com.alibaba.fastjson.JSONPObject
import com.example.baselibrary.activity.Baseactivity
import com.example.homelibrary.activity.HomeActivity
import com.example.melibrary.Activity.MeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Baseactivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        goMe.setOnClickListener {
            val intent = Intent(this, MeActivity::class.java)
            startActivity(intent)
        }


        val json = JSONPObject("")
    }
}
