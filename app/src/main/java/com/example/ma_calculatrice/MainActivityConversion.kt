package com.example.ma_calculatrice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ma_calculatrice.R
import android.widget.EditText
import android.widget.TextView
import android.view.MenuInflater
import android.widget.Toast
import android.content.Intent
import android.graphics.Color
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.ma_calculatrice.MainActivityScientific
import com.example.ma_calculatrice.MainActivity

class MainActivityConversion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_conversion)
        val mbutton: Button
        val mET: EditText
        val mTV: TextView
        mbutton = findViewById<View>(R.id.button) as Button
        mET = findViewById<View>(R.id.editText) as EditText
        mTV = findViewById<View>(R.id.textView) as TextView
        mbutton.setOnClickListener {
            val convert = mET.text.toString().toDouble()
            mTV.text = (convert * 100).toString() //Just put the formula here accordingly!!!
            mTV.setTextColor(Color.RED)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.scientific) {
            Toast.makeText(this, "Scientific", Toast.LENGTH_SHORT).show()
            val intent1 = Intent(this, MainActivityScientific::class.java)
            this.startActivity(intent1)
            finish()
            return true
        }
        if (id == R.id.standard) {
            Toast.makeText(this, "Standard", Toast.LENGTH_SHORT).show()
            val intent1 = Intent(this, MainActivity::class.java)
            this.startActivity(intent1)
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}