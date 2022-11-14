package com.example.test3

fun main(args: Array<String>){
    normalVarargs(1,2,3,4)//4개의 인자 구성
    normalVarargs(4,5,6) //3개의 인자 구성
}

fun normalVarargs(vararg counts: Int){
    for(num in counts) {
        println("$num")
    }
    print("\n")
}