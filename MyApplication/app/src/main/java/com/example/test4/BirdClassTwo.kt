package com.example.test4

class Bird5{
    //프로퍼티들
    var name: String
    var wing: Int
    var beak: String
    var color: String

    //첫 번째 부 생성자
    constructor(name: String, wing: Int, beak: String, color: String){
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }
    //두 번째 부 생성자
    constructor(_name: String, _beak: String){
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    }
    //메서드들
    fun fly() = println("Fly wing:$wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}

fun main(){
    val bird1 = Bird5("mybird", 2, "short", "blue") // 첫번째 부 생성자 호출
    val bird2 = Bird5("mybird2", "long") // 두번째 부 생성자 호출
    println("bird1.color: ${bird1.color}")
    println("bird2.color: ${bird2.color}")
    bird1.fly()
    bird2.fly()
    bird1.sing(3)
    bird2.sing(0)
}