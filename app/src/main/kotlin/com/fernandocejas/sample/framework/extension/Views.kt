package com.fernandocejas.sample.framework.extension

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide

fun ViewGroup.inflate(@LayoutRes layoutRes: Int): View = LayoutInflater.from(context).inflate(layoutRes, this, false)
fun ImageView.loadFromUrl(url: String) = Glide.with(this.context.applicationContext).load(url).into(this)
