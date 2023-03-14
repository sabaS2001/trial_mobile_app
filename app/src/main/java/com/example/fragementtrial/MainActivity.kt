package com.example.fragementtrial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ratingTV :TextView = findViewById(R.id.TVRating)
        ratingTV.setOnClickListener{
            var dialogVar = CustomDialogclass()
            dialogVar.show(supportFragmentManager,"Custom Dialog")
        }
    }
    fun receiveFeedback(feedback:String){
        val ratingTV : TextView = findViewById(R.id.TVRating)
        ratingTV.text = feedback
    }
}