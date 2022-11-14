package com.example.test4

//상속 가능한 클래스를 위해 open 사용
open class Bird12(var name: String, var wing: Int, var beak: String, var color: String){
    //메서드
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol:Int) = println("Sing vol: $vol") //오버라이딩 가능한 메서드
}
class Parrot2(name: String, wing:Int = 2, beak: String, color:String, // 마지막 인자만 var로 선언되어 프로퍼티가 추과됨
        var language: String = "natural") : Bird12(name, wing, beak, color){
            fun speak2() = println("Speak! $language") // Parrot에 추가된 메서드
            override fun sing(vol: Int){
                println("I'm a parrot! The volume level is $vol")
                speak2() //달라진 내용!
            }
        }
    fun main(){
        val parrot2 = Parrot2(name = "myparrot", beak = "short", color = "multiple")
        parrot2.language = "English"
        println("Parrot: ${parrot2.name}, ${parrot2.wing}, ${parrot2.beak}, ${parrot2.color}, ${parrot2.language}")
        parrot2.sing(5) // 달라진 메서드 실행 가능
    }