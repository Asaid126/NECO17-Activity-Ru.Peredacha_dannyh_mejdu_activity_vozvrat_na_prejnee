package com.example.neco17

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.neco17.databinding.ActivityMain2Binding
import com.example.neco17.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var bindingClass:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message=intent.getStringExtra("key") //Переменной присваиваем (получаем) данные из МайнАктивити
        bindingClass.textView2.text=message//присвоили техтВью переменную(можно было сразу без переменной)
    }
    fun onCleckBack(view: View){

        intent.putExtra("key2",bindingClass.edTname.text.toString())
        setResult(RESULT_OK, intent)
        finish()

    }

}