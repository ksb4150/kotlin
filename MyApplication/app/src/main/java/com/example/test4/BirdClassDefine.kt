package com.example.test4

class Bird { //(1) 클래스의 정의
    //(2) 프로퍼티들(속성)
    var name : String = "mybird"
    var wing : Int = 2
    var beak : String  = "short"
    var color : String = "blue"
    //(3)매서드들(함수)

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")}

fun main(){
    val coco = Bird() //(4)클래스의 생성자를  통한 객체의 생성
    coco.color ="red" //(5)객체의 프로퍼티에 값 할당

    println("coco.color: ${coco.color}") //(6) 객체의 맴버 프로퍼티 읽기
    coco.fly() // (7) 객체의 맴버 메서드의 사용
    coco.sing(3)}
