package com.alamin.databindingwithrecyclerview

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("setImage")
fun ImageView.setImage(photoUrl: String){
    this.load(photoUrl);
}