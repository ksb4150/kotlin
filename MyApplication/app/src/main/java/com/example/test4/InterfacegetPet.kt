package com.example.test4

interface Pet2{
    var category: String
    val msgTags: String //val 선언 시 게터의 구현이 가능
    get() = "I'm your lovely pet!"

    fun feeding()
    fun patting(){
        println("Kepp patting!")
    }
}

class Cat4(override var category: String) : Pet2{
    override  fun feeding(){
        println("Feed the cat a tuna can!")
    }
}

fun main(){
    val obj = Cat4("small")
    println("Pet Message Tags: ${obj.msgTags}")
    obj.feeding()//구현된 메서드
    obj.patting()//기본본 메서
}