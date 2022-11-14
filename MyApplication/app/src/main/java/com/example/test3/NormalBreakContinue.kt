package com.example.test3

fun main(){
    for(i in 1..5){
        if(i==3) break //continue로 바꾸면 1234 , outsode
        print(i)
    }
    println() //개별 문자
    println("outside")
}