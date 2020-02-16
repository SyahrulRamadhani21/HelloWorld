package com.example4068.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState !=null){
            textView.text=savedInstanceState.getString("text")
        }
    }

    fun HelloAndroid(view: View) {
        textView.text="Hello Android"
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("text",textView.text.toString())
        super.onSaveInstanceState(outState)
    }
}
