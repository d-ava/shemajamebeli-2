package com.example.shemajamebeli2

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

         val userMat = mutableMapOf<String, List<String>>()


        fun addUser() {

            if (email in userMat){
                binding.textInfo.text = "USER is here"
            }
            else {

                userMat[email] = listOf<String>(name, lastName, age)
                binding.textInfo.text = "USER ADDED"

            }


          //  Toast.makeText(this, "$userMat", Toast.LENGTH_LONG).show()
        }


        fun removeUser() {

            binding.textInfo.text = "USER REMOVED"

        }


        binding.btnAddUser.setOnClickListener {

            addUser()
        }



        binding.btnRemoveUser.setOnClickListener {


        }


    }
}