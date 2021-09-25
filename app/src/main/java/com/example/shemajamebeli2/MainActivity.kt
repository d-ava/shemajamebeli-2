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



        fun infoTXT(text:String, redGreen:Int){
            if (redGreen == 0){
                binding.textInfo.setTextColor(Color.RED)
                binding.textInfo.text = text
            }else{
                binding.textInfo.setTextColor(Color.GREEN)
                binding.textInfo.text = text
            }

        }

        val userMat = mutableMapOf<String, List<String>>()


        fun addUser() {

            if (email in userMat) {
                infoTXT("user is already here",0)
            } else {

                userMat[email] = listOf<String>(name, lastName, age)
                infoTXT("user added",1)
            }

        }


        fun removeUser() {

            if (email in userMat) {
                userMat.remove(email)
                infoTXT("bye bye ${userMat[email]}",1)
            } else {
                infoTXT("no such user",0)

            }
        }

        fun updateUser(){
            if (email in userMat){
                userMat[email]= listOf<String>(name, lastName, age)
                infoTXT("user $email has been updated",1)
            }else{
                infoTXT("no such user",0)
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