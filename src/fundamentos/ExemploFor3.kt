package fundamentos

//Acesso ao índice

fun main(args: Array<String>){
    val alunos = arrayListOf("André" , "Carla" , "Marcos")
    for ((indice, alunos) in alunos.withIndex()){
        println("$indice - $alunos \n" )
    }
}