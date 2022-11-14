package com.example.test4

open class Bird13(var name: String, var wing: Int, var beak: String, var color:String){
    fun fly() = println("Fly wing: $wing")
    open fun sing(vol: Int) = println("Sing vol: $vol")

}
class Parrot12(name: String, wing: Int = 2 , beak: String, color: String, var language: String = "natural") : Bird12(name, wing, beak, color){
    fun speak3() = println("Speak! $language")
    override fun sing(vol: Int) {
        super.sing(vol)
        println("I'm a parrot! The volume level is $vol")
        speak3()
    }
    }
fun main(){
    val parrotmo = Parrot12("soon", 4, "long", "orange")
    parrotmo.sing(4)
}