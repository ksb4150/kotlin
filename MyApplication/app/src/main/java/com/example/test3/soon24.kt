package com.example.test3

fun main(){
    println("labelBreak")
    for(i in 1..5){
        second@ for(j in 1..5){
            if(j == 3) break   //continue
            println("i:$i, j:$j")
        }
        println("after for j")
    }
    println("after for i")

}