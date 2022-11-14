package com.example.test4

class Person4{
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object{
        var language: String = "Korean"
        fun work(){
            println("working...")
        }
    }
}

fun main(){
    println(Person4.language) //인스턴스를 생성하지 않고 기본값 사용
    Person4.language = "English" //기본값 변경 가능
    println(Person4.language) //변경된 내용 출력
    Person4.work()//메서드 실행
    //println(Person.name) //name은 companion object가 아니므로 에러
}