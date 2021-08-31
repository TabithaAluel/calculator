package com.example.calculatorassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnmultiply=findViewById<Button>(R.id.btnmultiply)
        var btnadd=findViewById<Button>(R.id.btnadd)
        var btnsubstract=findViewById<Button>(R.id.btnsubstract)
        var btndivide=findViewById<Button>(R.id.btndivide)




    }






}