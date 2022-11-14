package com.example.test3

fun main(){
    var check = (5>3) && (5>2) // 2개의 항((5>3), (5>2))이 모드 참이면 true
    var check2 = (5>3) || (2>5) // 2개 중 1개의 항이 참이면 true
    var check3 = !(5>3) // true는 false로, false는 true로 변경

    println(check)
    println(check2)
    println(check3)

}