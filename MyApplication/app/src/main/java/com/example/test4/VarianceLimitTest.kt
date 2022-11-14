package com.example.test4

open class Animal3(val size: Int){
    fun feed() = println("Feeding...")
}

class Cat3(val jump: Int): Animal3(50)

class Spider(val poison: Boolean): Animal3(1)

//(1)형식 매개변수를 Animal로 제한
class Box2<out T: Animal3>(val element: T) { //주 생성자에서 val만 허용
    fun getAnimal(): T = element //(2) out은 반환 자료형에만 사용할 수 있음
    //fun set(new: T){ //(3) 오류! T는 in 위치에 사용할 수 없음
    //   element = new
    //}
}
fun main(){
    //일반적인 객체 선언
    val c1: Cat3 = Cat3(10)
    val s1: Spider = Spider(true)

    //클래스의 상위 자료형 변환은 아무런 문제 없음
    var a1: Animal3 = c1
    a1 = s1 //(4) a1 은 Spider의 객체가 됨
    println("a1.size = ${a1.size}")

    //(5) 공변성 - Cat은 Animal의 하위 자료형
    val c2: Box2<Animal3> = Box2<Cat3>(Cat3(10))
    println("c2.element.size = ${c2.element.size}")

    //(6)반대의 경우는 가능하지 않음
    // val c3:Box<Cat> = Box<Animal>(10) //오류!

    //(7) 자료형이 제한되 Animal과 하위 클래스 이외에는 사용할 수 없음
    // val c4:Box<Any> = Box<Int>(10) //오류!
}