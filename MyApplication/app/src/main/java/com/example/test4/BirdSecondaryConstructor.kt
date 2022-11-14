package com.example.test4

class Bird1{
    //(1) 프로퍼티들 - 선언만 함
    var name: String
    var wing: Int
    var beak: String
    var color: String
    //(2) 부 생성자 - 매개변수를 통해 초기화할 프로퍼티에 지정
    constructor(name: String, wing: Int, beak:String, color: String){
        this.name = name //(3) this.wing는 선언된 현재 클래스의 프로퍼티를 나타냄
        this.wing = wing
        this.beak = beak
        this.color = color
    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main(){
    val coco = Bird1("mybird",2,"short","blue") //(4) 생성자의 인자로 객체 생성과 동시에 초기화
    println("coco.color:${coco.color}") //(6) 객체의 맴버 프로퍼티 읽기
    coco.fly() //(7) 객체의 맴버 메서드의 사용
    coco.sing(3)
}