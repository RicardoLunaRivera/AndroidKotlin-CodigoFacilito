package com.example.cpandroidwkotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragment = MyFragment()
        replaceFrafment(fragment)
    }
        fun replaceFrafment(fragment: MyFragment){
            val fragmentTransition = supportFragmentManager.beginTransaction()
            fragmentTransition.replace(R.id.fragment,fragment)
            fragmentTransition.commit()

    }
}