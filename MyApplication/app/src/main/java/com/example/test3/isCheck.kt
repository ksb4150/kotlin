package com.example.test3

fun main(){
    val num: Any = 256.0f



    if(num is Int){ //num이 Int형일 때
        print(num)
    }else if (num !is Int) { //num이 Int형이 아닐 때 , !(num is Int)와 동일
        print("Not a Int")
    }

}