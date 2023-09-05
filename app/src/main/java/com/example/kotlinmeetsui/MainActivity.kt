package com.example.kotlinmeetsui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //listener for all buttons in the UI
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnTake = findViewById<Button>(R.id.btnTake)
        val txtValue = findViewById<TextView>(R.id.txtValue)
        val btnGrow = findViewById<Button>(R.id.btnGrow)
        val btnShrink = findViewById<Button>(R.id.btnShrink)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnHide = findViewById<Button>(R.id.btnHide)

        var size:Float
        //onclick functions
        btnAdd.setOnClickListener {
            value++
            txtValue.text = "$value"
        }
        btnTake.setOnClickListener {
            value --
            txtValue.text = "$value"
        }
        btnReset.setOnClickListener {
            value = 0
            txtValue.text = "$value"
        }
        btnGrow.setOnClickListener {
            size = txtValue.textScaleX
            txtValue.textScaleX = size + 1
        }
        btnShrink.setOnClickListener {
            size = txtValue.textScaleX
            txtValue.textScaleX = size - 1
        }
        btnHide.setOnClickListener {
            if(txtValue.visibility == View.VISIBLE){
                //currently visible so hide it
                txtValue.visibility = View.INVISIBLE

                //change text button
                btnHide.text  = "SHOW"
            }else{
                //currently hidden so show it
                txtValue.visibility = View.VISIBLE

                //change button text
                btnHide.text = "HIDE"
            }
        }


    }

    //an int to hold a value
    private var value :Int = 0



}


