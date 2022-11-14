package com.example.test4

class GenericNull<T>{ //기본적으로 null이 허용되는 형식이 매개변수
    fun EqualityFuc(arg1: T, arg2: T){
        println(arg1?.equals(arg2))
    }
}

fun main(args:Array<String>){
    val obj = GenericNull<String>() //non-null로 선언됨
    obj.EqualityFuc("Hello","World")//null이 허용되지 않음

    val obj2 = GenericNull<Int?>() //null이 가능한 형식으로 선언됨
    obj2.EqualityFuc(null, 10) //null 사용

}