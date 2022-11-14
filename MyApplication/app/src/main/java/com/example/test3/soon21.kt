package com.example.test3

fun main(){
    cases("Hello") // String
    cases(1) //Int
    cases(System.currentTimeMillis()) //Long
    //cases(MyClass()) //객체 Not a String이 안뜨고 오류가 난다...
}

fun cases(obj: Any){
    when(obj){
        1 -> println("Int: $obj")
        "Hello" -> println("String: $obj")
        is Long -> println("Long: $obj")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }

}

