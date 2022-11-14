package com.example.test4

data class Customer(var name: String, var email:String){
    var job: String = "Unknown"
    constructor(name: String, email: String, _job: String): this(name, email){
        job = _job
    }
    init{
        //간단한 로직은 여기에

    }
}


fun main(){
    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")
    val cus3 = cus1.copy(name = "Alice") //name만 변경하고자 할때

    println( cus1 == cus2) //동등성 비교 true
    println( cus1.equals(cus2)) //위와 동일 true
    println( "${cus1.hashCode()}, ${cus2.hashCode()}")//고유값도 동일
    println(cus1.toString())
    println(cus3.toString())
}