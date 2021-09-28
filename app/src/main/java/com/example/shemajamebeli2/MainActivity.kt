package com.example.shemajamebeli2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.shemajamebeli2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        //val userMap = mutableMapOf<String, List<String>>()

        var list = mutableListOf<UserData>()

        binding.btnAddUser.setOnClickListener {
            val email: String = binding.ETeMail.text.toString()
            val name: String = binding.ETName.text.toString()
            val age: Int = binding.ETage.text.toString().toInt()
            val lastName = binding.ETlastName.text.toString()

            //var userData:UserData = UserData(email, name, age, lastName)

            for (element in list){
                if (element.email == email){
                    Toast.makeText(this, "email already", Toast.LENGTH_LONG).show()
                }
                else list.add(UserData(email, name, age, lastName))
            }

            list.add(UserData(email, name, age, lastName))


            /*if (email !in userMap.keys) {

                userMap[email] = listOf<String>(name, lastName, age)

                binding.additionalTextInfo.text = "userlist $userMap \n"
                binding.textInfo.setTextColor(Color.GREEN)
                binding.textInfo.text = "USER ADDED"
            } else {

                binding.textInfo.setTextColor(Color.RED)
                binding.textInfo.text = "USER is already here"
            }
        }*/

            binding.btnRemoveUser.setOnClickListener {
                /*val email: String = binding.ETeMail.text.toString()

                if (email in userMap.keys) {
                    userMap.remove(email)
                    binding.textInfo.setTextColor(Color.GREEN)
                    binding.textInfo.text = "USER removed"
                    binding.additionalTextInfo.text = "userlist $userMap"

                } else {
                    binding.textInfo.setTextColor(Color.RED)
                    binding.textInfo.text = "nu such user$email"

                }*/


            }

            /*binding.btnUpdateUser.setOnClickListener {
                val email: String = binding.ETeMail.text.toString()
                val name: String = binding.ETName.text.toString()
                val age: String = binding.ETage.text.toString()
                val lastName = binding.ETlastName.text.toString()

                if (email in userMap.keys){
                    userMap[email]= listOf<String>(name, lastName, age)
                    binding.textInfo.setTextColor(Color.GREEN)
                    binding.textInfo.text = "USER updated"
                    binding.additionalTextInfo.text = "userlist $userMap"
                }else{
                    binding.textInfo.setTextColor(Color.RED)
                    binding.textInfo.text = "nu such user$email"
                }

            */
        }
    }
}