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


        val list = mutableListOf<String>()
        var email = binding.editTextemail.text.toString()


        binding.buttonAddUser.setOnClickListener {

            if (email in list){
                Toast.makeText(this, "this user is already exist", Toast.LENGTH_SHORT).show()

            }else list.add(email)




        }


    }
}