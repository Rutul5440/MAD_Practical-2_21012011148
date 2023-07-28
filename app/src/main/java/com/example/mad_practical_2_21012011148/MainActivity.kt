package com.example.mad_practical_2_21012011148

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG:String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is called")
    }

    fun showMessage(Message:String){
        Log.i(TAG, Message)
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show()
        val v:ConstraintLayout = findViewById(R.id.myconstraintlayout)
       Snackbar.make(
            findViewById(R.id.myconstraintlayout),

            Message,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart Method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart method is called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method is called")
    }

}