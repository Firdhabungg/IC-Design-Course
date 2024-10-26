package com.example.icdesigncourse

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuLogin : AppCompatActivity() {
    companion object {
        var email = "icdesign@gmail.com"
        var pass = "1234"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txtEmail:EditText = findViewById(R.id.isiEmail)
        val txtPassword:EditText = findViewById(R.id.isiPassword)
        val btnMasuk: Button = findViewById(R.id.btnMasuk)
        val btnGoogle: Button = findViewById(R.id.btnLogin)

        btnMasuk.setOnClickListener{
            if (txtEmail.text.toString() == email &&
                txtPassword.text.toString() == pass){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Login failed, Check your email and password",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}