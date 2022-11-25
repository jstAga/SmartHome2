package com.geektech.smarthome2

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.load(uri:String){
    Glide.with(this).load(uri).into(this)
}