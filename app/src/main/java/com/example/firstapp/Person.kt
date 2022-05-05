package com.example.firstapp

import java.io.Serializable

data class Person(
    val firstName : String,
    val lastName : String,
    val country : String,
    val birthDate : String

) : Serializable {
}