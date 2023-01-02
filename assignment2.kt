package com.example.myapplication1



    fun main(){
        for(i in 0..100) {
            if (i == 71) continue
            println("IT'S OVER 70")
        }

        var temprature = 35

        while ( temprature > 10){
            if (temprature == 30)
                println("the temparature is $temprature ,its to hot")
            else if( temprature == 20)
                println("the temparature is $temprature ,its compfy")
            else if (temprature == 15)
                println("the temparature is $temprature , its to cold")
            else {
                println(temprature)
            }
            temprature -= 1
        }

        //false
        //1
        //true
        //true
        //-1
        //true
        //4
    }
