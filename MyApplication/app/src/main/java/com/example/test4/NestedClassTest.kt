package com.example.test4

class Outer{
    val ov = 5
    class Nested{
        val nv = 10
        fun greeting() = "[Nesred] Hello ! $nv" //외부의 ov에는 접근 불가



        fun accessOuter(){ //캠패니언 객체는 접근 할 수 있음
            println(country)
            getSomething()
        }
    }
        companion object{ //캠패니언 객체는 static처럼 접근 가능

            const val country = "Korea"

            fun getSomething() = println("Get something...")
        }

    fun outside(){
        val msg = Nested().greeting() //Outer 객체 생성 없이 중첩 클래스의 메서드 접근
        println("[Outer]:$msg, ${Nested().nv}")//중첩 클래스의 프로퍼티 접근
    }
}
fun main(){
    //static 처럼 Outer의 객체 생성 없이 Nested객체 생성 사용할 수 있음
    val output = Outer.Nested().greeting()
    println(output)

    val abc = Outer.Nested().accessOuter()

    //Outer.outside() //에러! Outer 객체 생성 필요
    val outer = Outer()
    outer.outside()


}


