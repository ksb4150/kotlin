package com.example.test3

class InvalidNameException(message: String) : Exception(message)// (1)사용자 예외 클래스

fun main(){
    var name = "soonmin123" //(2) 숫자가 포함된 이름
    try{
        validateName(name)
    } catch (e: InvalidNameException){ // (4) 숫자가 포함된 예외처리}
        println(e.message)
    } catch (e: Exception){ //(5)기타 예외 처리
        println(e.message)
     }
}

fun validateName(name: String){
    if(name.matches(Regex(".*\\d+.*"))){ //(3) 이름에 숫자가 포함되어 있으면 예외 던지기
        throw InvalidNameException("Your name : $name: contains numerals.")
    }
}