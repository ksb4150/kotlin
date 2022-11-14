package com.example.test3

fun main(){
    retFunc()
}
fun inlineLambda2(a:Int, b: Int, out:(Int, Int) -> Unit){//inline이 제거됨
 out(a, b) }

fun retFunc2(){
    println("start of retFunc")
    inlineLambda2(13,3){ a, b ->
        val result = a + b
        if(result > 10) return@inlineLambda2
        println("result: $result")
    }
    println("end of retFunc")
}