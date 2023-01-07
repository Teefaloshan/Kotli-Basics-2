package com.example.myapplication1

fun main(){

    var Task1: Task = Task (20, "hanan","hi", true)
    var Task2: Task = Task( 10, "Rana", "hello", true)
    var Task3: Task = Task( 30, "khalid", "welcome", false)
    var Task4: Task = Task( 40, "Ahmad", "Good evening", true)


    var todolist: Todo = Todo()
    todolist.addTasks(Task1)
    todolist.addTasks(Task2)
    todolist.addTasks(Task3)
    todolist.addTasks(Task4)

    todolist.Alltask()
    todolist.printS(30)
    todolist.addTasks(Task1)
    todolist.RemoveTask(20)
    todolist.ChangeTask(Task4)

}

data class Task(
    val id: Int,
    val name: String,
    val note: String,
    var isComplete: Boolean = false
)

class Todo(){
    var Tasks = arrayListOf<Task>()
    private set

   fun Alltask() {
       for(i in Tasks) {
           println(i)
           println()
       }
   }

    fun printS(ID: Int){
        for(i in Tasks){
            if(ID == i.id){
                println("the task is:  $i")
                return }
            }
                println("tasks id is not there")
        }

    fun addTasks(Task1: Task ){
        Tasks.add(Task1)
    }

    fun RemoveTask(ID: Int){
            for (i in Tasks.indices) {
                if (ID == Tasks[i].id) {
                    Tasks.removeAt(i)
                    return
                    println(ID)

                }
            }
    }
    fun ChangeTask(Task4: Task){
        Task4.isComplete =! Task4.isComplete
        println(Task4)
    }


}

