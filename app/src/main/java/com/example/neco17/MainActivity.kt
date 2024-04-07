package com.example.neco17

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.neco17.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var bindingClass:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass=ActivityMainBinding.inflate(layoutInflater)
        setContentView((bindingClass.root))

        val message=intent.getStringExtra("key")
        bindingClass.textView.text=message
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 100 && resultCode == RESULT_OK && data != null ){

            bindingClass.textView.text=data.getStringExtra("key2")

        }
    }
    fun onClick1(view: View){
        val intentI=Intent(this,MainActivity2::class.java)
        intentI.putExtra("key","Как тебя зовут?")
        startActivityForResult(intentI,100)


    }

    }
