package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count = 0
        binding.btnApply.setOnClickListener(){
            val firstName = binding.etFirstName.text.toString()
            val lastName = binding.etLastName.text.toString()
            val country = binding.etCountry.text.toString()
            val birthDate = binding.etBirthDate.text.toString()
            val person = Person(firstName,lastName,country,birthDate)
            count++
            binding.tvCount.text = "Number of entries = $count"
            Log.d("MainActivity", "$firstName $lastName , from $country , born on $birthDate .")

            Intent(this,SecondActivity::class.java).also{
                it.putExtra("EXTRA_PERSON",person)
                startActivity(it)
            }









//            val dispView = "The information you've entered is \n" +
//                    "First Name : $firstName \n" +
//                    "Last Name : $lastName \n" +
//                    "Country : $country \n" +
//                    "DOB : $birthDate \n" +
//                    "And you are entry number : $count"
//
//            binding.tvdisplay.text = dispView

//            Intent(this , SecondActivity::class.java).also {
//                it.putExtra("EXTRA_FIRSTNAME" , firstName)
//                it.putExtra("EXTRA_LASTNAME" , lastName)
//                it.putExtra("EXTRA_COUNTRY" , country)
//                it.putExtra("EXTRA_BIRTHDATE" , birthDate)
//                startActivity(it)
//            }

            Toast.makeText(this,"Your response has been recorded.",Toast.LENGTH_LONG).show()
        }
    }


}