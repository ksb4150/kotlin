package com.example.test4

interface Pet3{
    var category: String
    val msgTags: String //val 선언 시 게터의 구현이 가능
    get() = "I'm your lovely pet!"

    fun feeding()
    fun patting(){
        println("Keep patting!")
    }
}
open class Animal(val name: String)
//(1) feeding의 구현을 위해 인터페이스 Pet 지정
class Dog(name: String, override var category: String): Animal(name), Pet3{
    override fun feeding(){
        println("Feed the dog a bone")
    }
}
class Cat7(name: String, override var category: String) : Animal(name), Pet3{
    override fun feeding(){
        println("Feed the cat a funa can!")
    }
}

class Master{
    fun playWithPet(dog: Dog){ //(2) 각 애완동물 종류에 따라 오버로딩됨
        println("Enjoy with my dog.")
     }
    fun playWithPet(cat: Cat7){ //(3) 고양이를 위한 메서드
        println("Enjoy with my cat.")

    }
}

fun main(){
    val master = Master()
    val dog = Dog("Toto","Small")
    val cat = Cat7("Coco" , "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}