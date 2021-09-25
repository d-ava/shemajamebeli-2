package com.example.shemajamebeli2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shemajamebeli2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userMap = mutableMapOf<String, String>()

        binding.btnAddUser.setOnClickListener {
            val email:String = binding.ETeMail.text.toString()
            val name:String = binding.ETName.text.toString()

            userMap[email] = name

            binding.additionalTextInfo.text = "map $userMap"
        }

    /*    fun infoTXT(text:String, redGreen:Int){
            if (redGreen == 0){
                binding.textInfo.setTextColor(Color.RED)
                binding.textInfo.text = text
            }else{
                binding.textInfo.setTextColor(Color.GREEN)
                binding.textInfo.text = text
            }

        }


        val email:String = binding.ETeMail.text.toString()
        val name = binding.ETName.text.toString()
        val age: String = binding.ETage.text.toString()
        val lastName = binding.ETlastName.text.toString()


        val userMap = mutableMapOf<String, List<String>>()


        fun addUser() {

            if (email in userMap.keys) {
                infoTXT("user is already here",0)
            } else {

                userMap[email] = listOf<String>(name, lastName, age)
                infoTXT("user added",1)
                    // binding.additionalTextInfo.text = "map $userMap"
            }

        }
        binding.btnAddUser.setOnClickListener {
            addUser()
        }




        fun removeUser() {

            if (email in userMap.keys) {
                userMap.remove(email)
                infoTXT("bye bye ${userMap[email]}",1)
            } else {
                infoTXT("no such user",0)

            }
        }

        fun updateUser(){
            if (email in userMap.keys){
                userMap[email]= listOf<String>(name, lastName, age)
                infoTXT("user $email has been updated",1)
            }else{
                infoTXT("no such user",0)
            }
        }






        binding.btnRemoveUser.setOnClickListener {
            removeUser()

        }

        binding.btnUpdateUser.setOnClickListener {
            updateUser()
        }
*/

    }
}