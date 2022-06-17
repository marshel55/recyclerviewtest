package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerview:RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter
    }

    private fun init(){

        recyclerview = findViewById(R.id.rcycview)

        var data = ArrayList<SocialMedia>()
        data.add(SocialMedia(R.drawable.facebook, "Facebook", "Icon Facebook"))
        data.add(SocialMedia(R.drawable.instagram, "Instagram", "Icon Instagram"))
        data.add(SocialMedia(R.drawable.twitter, "Twitter", "Icon Twitter"))
        data.add(SocialMedia(R.drawable.whatsapp, "Whatsapp", "Icon Whatsapp"))
        data.add(SocialMedia(R.drawable.youtube, "Youtube", "Icon Youtube"))
        data.add(SocialMedia(R.drawable.facebook, "Facebook", "Icon Facebook"))
        data.add(SocialMedia(R.drawable.instagram, "Instagram", "Icon Instagram"))
        data.add(SocialMedia(R.drawable.twitter, "Twitter", "Icon Twitter"))
        data.add(SocialMedia(R.drawable.whatsapp, "Whatsapp", "Icon Whatsapp"))
        data.add(SocialMedia(R.drawable.youtube, "Youtube", "Icon Youtube"))

        adapter = MyAdapter(data)
    }
}