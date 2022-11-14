package com.example.test4

class Bird6(var name: String, var wing:Int, var beak: String, var color: String){
    init {
        println("--------초기화 블록 시작--------")
        println("이름은 ${name}, 부리는 ${beak}")
        this.sing(3)
        println("--------초기화 블록 끝 ---------")
    }

    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
 fun main(){
     val coco = Bird6("Youbird", 2, "long","red")
     println("coco.name: ${coco.name}, coco.wing ${coco.wing}")
     println("coco.color: ${coco.color}, coco.beak ${coco.beak}")
 }