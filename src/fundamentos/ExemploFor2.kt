package fundamentos

fun main(args: Array<String>){

    //Intervalo fixo (com passo)

    for (i in 0 .. 100 step 5){
        println(i)
    }
    for (i in 100 downTo 0 step 5){
        println(i)
    }
}