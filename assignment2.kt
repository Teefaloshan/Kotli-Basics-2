package com.example.myapplication1



    fun main() {
        for (i in 0..100) {
            if (i == 71) {
                println("IT'S OVER 70")
                break
            } else
            {
                println(i)
            }
        }

        var temprature = 35
       while(temprature > 10){
        when (temprature) {
            30 ->  println("the temparature is $temprature ,its to hot")
            20 ->  println("the temparature is $temprature ,its compfy")
            15 ->  println("the temparature is $temprature , its to cold")
            else -> println(temprature)
        }
            temprature -= 1
       }
    }
        //false
        //1
        //true
        //true
        //-1
        //true
        //4

