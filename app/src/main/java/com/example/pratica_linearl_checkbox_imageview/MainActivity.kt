package com.example.pratica_linearl_checkbox_imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkbox_1.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        if (v.checkbox_1.isChecked) {
            drwColor1(v)
        }
        else{
            drwColor2(v)
        }
    }

    private fun drwColor2(v: View) {
        v.img1.setColorFilter(resources.getColor(R.color.yellowMoon))
    }


    private fun drwColor1(v: View) {
    v.img1.setColorFilter(resources.getColor(R.color.bmoon))
    }
}