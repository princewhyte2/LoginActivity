package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username:EditText = findViewById(R.id.username_field)
        var password:EditText = findViewById(R.id.password_field)
        var button:Button = findViewById(R.id.button)

        button.setOnClickListener{
            if(username.text.toString() == "Admin" || password.text.toString() == "Admin@123"){
                val intent = Intent(this,Home::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Use Admin as the username and Admin@123 as the password",Toast.LENGTH_LONG).show()
            }
        }


    }


}