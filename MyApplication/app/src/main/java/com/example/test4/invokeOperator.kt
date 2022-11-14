package com.example.test4

class Manager {
    operator fun invoke(value: String){
        println(value)
    }
}

fun main(){
    val manager = Manager()
    manager("Do something for me!")//manager.invoke("...")형태로 호출되며 invoke가 생략되었다.

}