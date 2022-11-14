package com.example.test4

open class Base2{ //최상위 선언 클래스에는 protected를 사용할 수 없음
    protected  var i = 1
    protected  fun protectedFunc(){
        i += 1  //접근 허용
    }
    fun access(){
        println(i)
        protectedFunc()//접근 허용
    }
    protected class Nested //내부 클래스에는 지시자 허용
}
class Derived : Base2(){
    fun test(base2: Base2): Int{
        protectedFunc() // Base 클래스의 메서드 접근 가능
        return i // Base 클래스의 프로퍼티 접근 가능
    }
}
fun main(){
    val base2 = Base2() //생성 가능
    //base2.i //접근 불가
    //base2.protectedFunc() //접근 불가
    base2.access() //접근 가능
}