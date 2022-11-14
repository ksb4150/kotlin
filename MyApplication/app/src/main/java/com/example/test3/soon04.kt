package com.example.test3

fun main(){
    var str1 : String? = "Hello Kotlin"
    str1 = null //null을 허용하지 않음(오류 발생) String에 ?를 붙이면 허용
    println("str1: $str1")
}