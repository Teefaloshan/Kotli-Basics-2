package com.example.myapplication1

fun main(){
    var Num = arrayListOf<Double>()
    Num.add(2.22)
    Num.add(3.00)
    Num.add(23.0)
    Num.add(15.3)
    Num.add(60.9)

    println(Num)
    val Result = (Num[0] + Num[1] + Num[2] + Num[3] + Num[4])
    println("The average is :"+ Result / 5 )
    println()

    assign(2.3, 6.1, "+")
    assign(2.3, 6.1)
    assign(50.4, 23.5, "-")
    assign(12.0, 6.0, "/")
    assign(10.0, 9.4, "*")
    assign(28.8, 97.7, "%")
}

fun assign(A1: Double, A2: Double, A3: String = "+"){
    when(A3){
        "+" -> println(A1 + A2)
        "-" -> println(A1 - A2)
        "*" -> println(A1 * A2)
        "/" -> println(A1 / A2)
        else -> println("The String Parameter is not accepted")
    }
}