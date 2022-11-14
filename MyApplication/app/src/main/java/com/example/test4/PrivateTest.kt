package com.example.test4

private  class PrivateClass{
    private var i = 1
    fun privateFunc(){
        i += 1 //접근 허용
    }
    fun access(){
        println(2)
        println(i)
        privateFunc()//접근 허용
    }
}
class OtherClss{
    //val opc = PrivateClass() //불가 - 프로 퍼티 opc는 private이 되어야함
    fun test(){
        val pc = PrivateClass() //생성 가능

    }
}
fun main(){
    val pc = PrivateClass() //생성 가능
    pc.access()

   // pc.i //접근 불가
   pc.privateFunc() // 접근 불가
}
fun Topfunction(){
    val tpc = PrivateClass() //객체 생성가능
}