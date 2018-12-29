package com.nsankhla.kotlinfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countme(view: View){
        val showCountTextView=findViewById<TextView>(R.id.textView)
        val countString =showCountTextView.text.toString()
        var count:Int = Integer.parseInt(countString)
        count++
        showCountTextView.setText(count.toString())

    }
    fun randomMe(view: View){
        val showCountTextView=findViewById<TextView>(R.id.textView)
        val countString =showCountTextView.text.toString()
        var count:Int = Integer.parseInt(countString)

        val randomIntent = Intent(this,Main2Activity::class.java)

        randomIntent.putExtra(Main2Activity.TOTAL_COUNT,count)
        startActivity(randomIntent)
    }
}
