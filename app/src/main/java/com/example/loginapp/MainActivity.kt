package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<TextView>(R.id.username)
        var password = findViewById<TextView>(R.id.password)
        var button = findViewById<MaterialButton>(R.id.loginbtn)

        //admim and admin

        button.setOnClickListener {
            if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                //correct
                Toast.makeText(applicationContext, "LOGGED IN SUCCESSFUL!", Toast.LENGTH_SHORT).show()
            }else{
                //incorect
                Toast.makeText(applicationContext, "LOGGED IN FAILED !!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}