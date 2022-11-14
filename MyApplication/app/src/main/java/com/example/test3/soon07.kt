package com.example.test3

fun main(){
    val a: Int = 128
    val b: Int = 128
    val d: Int? = 128
    println(a == b) //true
    println(a === b) //true

    println(a == d) //true
    println(a === d) //false


}