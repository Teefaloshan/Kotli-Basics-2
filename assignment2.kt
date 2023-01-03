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
        when (temprature) {

            30 -> { println("the temparature is $temprature ,its to hot")
                temprature -= 1
            }
            20 -> { println("the temparature is $temprature ,its compfy")
                temprature -= 1
            }
            15 -> { println("the temparature is $temprature , its to cold")
                temprature -= 1
            }
            else -> { println(temprature)
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
    }
