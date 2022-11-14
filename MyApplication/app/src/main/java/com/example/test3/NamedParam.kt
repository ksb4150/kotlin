package com.example.test3

fun main(args: Array<String>){
    nameParam(x = 200, z = 100) // x, z의 이름과 함께 함수 호출(y는 기본값 사용)
    nameParam(z = 150) // z의 이름과 함게 함수 호출(x와 y는 기본 값으로 지정됨)
}
fun nameParam(x: Int = 100, y: Int = 200, z: Int){
    println(x+y+z)
}