package com.example.shemajamebeli2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.shemajamebeli2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var userList = mutableListOf<UserData>()
        val list = mutableListOf<String>()

        var email = binding.ETemail.text.toString()
        var name = binding.ETName.text.toString()
        var age: Int = binding.ETAge.text.toString().toInt()
        var lastName = binding.ETLastName.text.toString()

        fun addUser() {
            list.add(email)
            binding.textInfo.text = "USER ADDED"

        }

        fun removeUser() {
            list.remove(email)
            binding.textInfo.text = "USER REMOVED"

        }


        binding.buttonAddUser.setOnClickListener {

            if (email in list) {
                Toast.makeText(this, "this user is already exist", Toast.LENGTH_SHORT).show()


            } else addUser()

        }

        binding.btnRemoveUser.setOnClickListener {
            if (email in list) {

                removeUser()
            } else Toast.makeText(this, "this user does not exist", Toast.LENGTH_SHORT).show()

        }


    }
}