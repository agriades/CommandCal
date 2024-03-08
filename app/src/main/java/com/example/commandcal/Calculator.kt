package com.example.commandcal

class Calculator {
    fun addIs(num1: Int, num2: Int) {
        println("${num1} 더하기 ${num2}은(는) ${num1+num2} 입니다.")
    }
        fun subtractIs(num1: Int, num2: Int) {
        println("${num1} 빼기 ${num2}은(는) ${num1-num2} 입니다.")
    }
    fun multiplyIs(num1: Int, num2: Int) {
        println("${num1} 곱하기 ${num2}은(는) ${num1*num2} 입니다.")
    }
    fun divideIs(num1: Int, num2: Int) {
        println("${num1} 을 ${num2}으로 나눈 몫은 ${num1/num2} 입니다.")
    }

    fun modIs(num1: Int, num2: Int) {
        println("${num1} 을 ${num2}으로 나눈 나머지는 ${num1%num2} 입니다.")
    }
}