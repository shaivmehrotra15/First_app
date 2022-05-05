package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        val firstName = intent.getStringExtra("EXTRA_FIRSTNAME")
//        val lastName  = intent.getStringExtra("EXTRA_LASTNAME")
//        val country = intent.getStringExtra("EXTRA_COUNTRY")
//        val birthDate = intent.getStringExtra("EXTRA_BIRTHDATE")
//
//        val dispView = "The information you've entered is \n" +
//                    "First Name : $firstName \n" +
//                    "Last Name : $lastName \n" +
//                    "Country : $country \n" +
//                    "DOB : $birthDate \n"


        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        binding.tvPerson.text = person.toString()

    }
}