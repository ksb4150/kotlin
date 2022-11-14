package com.example.test4

open class Parent
class Child1: Parent()
class Cup<T>
fun main(){
    val obj1: Parent = Child1() //Parent 형식의 obj1은 Child로 형 변환될 수 있음

  //  val obj2:Child1 = Parent() //에러! 하위 형식인 Child의 객체 obj2는 parent로 변환되지 않음
  //  val obj3:Cup<Parent> = Cup<Child1>() //에러! 자료형 형식이 일치하지 않음
  //  val obj4:Cup<Child1> = Cup<Parent>() //에러! 자료형 형식이 일치하지 않음

    val obj5 = Cup<Child1>() //obj5는 Cup<Child> 형식이 됨
    val obj6: Cup<Child1> = obj5 //형식이 일치하므로 ok!
}