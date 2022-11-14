package com.example.test4;

public class KCustomerAccess {
    public static void main(String[] args){
        //코틀린 클래스의 캠패니언 객체를 접근
        System.out.println(KCustomer.LEVEL);
        KCustomer.login(); //애노테이션을 사용할 때 접근 방법
        KCustomer.Companion.login(); //애노테이션을 사용할 때 접근 방법
    }
}
