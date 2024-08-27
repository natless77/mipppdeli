package com.apsel.mipppdeli.activities

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.apsel.mipppdeli.R





class RegisterActivity : AppCompatActivity() {

    val TAG = "RegisterActivity"

    var imageViewGoToLogin: ImageView? = null
    var editTextName: EditText? = null
    var editTextLastname: EditText? = null
    var editTextEmail: EditText? = null
    var editTextPhone: EditText? = null
    var editTextPassword: EditText? = null
    var editTextConfirmPassword: EditText? = null
    var buttonRegister: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        imageViewGoToLogin = findViewById(R.id.imageview_go_to_login)
        editTextName = findViewById(R.id.edittext_name)
        editTextLastname = findViewById(R.id.edittext_lastname)
        editTextEmail = findViewById(R.id.edittext_email)
        editTextPhone = findViewById(R.id.edittext_phone)
        editTextPassword = findViewById(R.id.edittext_password)
        editTextConfirmPassword = findViewById(R.id.edittext_confirm_password)
        buttonRegister = findViewById(R.id.btn_register)

        imageViewGoToLogin?.setOnClickListener { goToLogin() }
        buttonRegister?.setOnClickListener { register() }

    }

    private fun register(){

            val name = editTextName?.text.toString()
            val lastname = editTextLastname?.text.toString()
            val email = editTextEmail?.text.toString()
            val phone = editTextPhone?.text.toString()
            val password = editTextPassword?.text.toString()
            val confirmPassword = editTextConfirmPassword?.text.toString()

            Log.d(TAG, "El nombre es: $name" )
            Log.d(TAG, "El apellido es: $lastname" )
            Log.d(TAG, "El email es: $email" )
            Log.d(TAG, "El telofono es: $phone" )
            Log.d(TAG, "El password es: $password" )
            Log.d(TAG, "El confirm password es: $confirmPassword" )

    }


    private fun goToLogin(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}