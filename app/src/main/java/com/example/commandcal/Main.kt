package com.example.commandcal

fun main(){
    println("첫 번째 정수 입력: ")
    val num1 = readLine()!!.toInt()
    println("[1] 덧셈, [2]뺄셈, [3]곱셈, [4]나눗셈, [5]나머지, [-1]종료")
    val sign = readLine()!!.toInt()
    println("두 번째 정수 입력: ")
    val num2 = readLine()!!.toInt()

    val c = Calculator()

    when (sign){
        1 -> c.addIs(num1,num2)
        2 -> c.subtractIs(num1,num2)
        3 -> c.multiplyIs(num1,num2)
        4 -> c.divideIs(num1,num2)
        5 -> c.modIs(num1,num2)
    }

    println("끝!")

}