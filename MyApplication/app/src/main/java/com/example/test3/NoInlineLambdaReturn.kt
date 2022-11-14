package com.example.test3

fun main() {
    retFunc1()
}


    fun inlineLambda1(a: Int, b: Int, out:(Int, Int) -> Unit) { //inline이 제거됨
        out(a, b)
    }

    fun retFunc1(){
        println("start of retFunc")
        inlineLambda1(13,3) lit@{ a, b ->
        val result = a + b
        if(result > 10 ) return@lit
        println("result: $result")
        }
    println("end of retFunc")
    }
