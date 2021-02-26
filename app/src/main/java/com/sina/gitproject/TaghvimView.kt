package com.sina.gitproject

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class TaghvimView(context: Context, attrs: AttributeSet):ConstraintLayout(context,attrs){

    init {
        inflate(context, R.layout.taghvim_view, this)
        val textView: TextView = findViewById(R.id.)
        val attributes = context.obtainStyledAttributes(attrs, R.styleable.TaghvimView)


    }
}