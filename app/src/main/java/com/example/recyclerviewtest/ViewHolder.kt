package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import java.util.zip.Inflater

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recyclerviewtemplate, parent, false)) {

        private var imgview:ImageView? = null
        private var txt_title:TextView? = null
        private var txt_subtitle:TextView? = null

    init {
        imgview = itemView.findViewById(R.id.img)
        txt_title = itemView.findViewById(R.id.title)
        txt_subtitle = itemView.findViewById(R.id.sub_title)
    }

    fun bind(data:SocialMedia){
        imgview?.setImageResource(data.imgview)
        txt_title?.text = data.txttitle
        txt_subtitle?.text = data.txt_subtitle
    }
}