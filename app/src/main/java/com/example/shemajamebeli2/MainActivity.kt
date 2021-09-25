package com.example.shemajamebeli2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Toast
import com.example.shemajamebeli2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val email = binding.ETeMail.text.toString()
        val name = binding.ETName.text.toString()
        val age: String = binding.ETage.text.toString()
        val lastName = binding.ETlastName.text.toString()

        fun greenTXT(text: String) {
            binding.textInfo.setTextColor(Color.GREEN)
            binding.textInfo.text = text
        }

        fun redTXT(text: String) {
            binding.textInfo.setTextColor(Color.RED)
            binding.textInfo.text = text

        }

        val userMat = mutableMapOf<String, List<String>>()


        fun addUser() {

            if (email in userMat) {
                redTXT("user is already here")
            } else {

                userMat[email] = listOf<String>(name, lastName, age)
                greenTXT("user added")

            }


            //  Toast.makeText(this, "$userMat", Toast.LENGTH_LONG).show()
        }


        fun removeUser() {

            if (email in userMat) {
                userMat.remove(email)
                greenTXT("bye bye ${userMat[email]}")
            } else {
                redTXT("no such user")

            }
        }

        fun updateUser(){
            if (email in userMat){
                userMat[email]= listOf<String>(name, lastName, age)
                greenTXT("user $email has been updated")
            }else{
                redTXT("no such user")
            }
        }


        binding.btnAddUser.setOnClickListener {

            addUser()
        }



        binding.btnRemoveUser.setOnClickListener {
            removeUser()

        }

        binding.btnUpdateUser.setOnClickListener {
            updateUser()
        }


    }
}