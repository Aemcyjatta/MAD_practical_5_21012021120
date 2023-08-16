package com.example.mad_practical_5_21012021120

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browseButton:Button=findViewById(R.id.Button_Browse)
        val editTextBrowser:EditText=findViewById(R.id.editTextText)
        browseButton.setOnClickListener{
            openurl(editTextBrowser.text.toString())
        }
    }
    fun openurl(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun phone(number:String){

    }
    fun calllog(){

    }
    fun gallery(){

    }
    fun camera(){

    }
    fun alarm(){

    }
}