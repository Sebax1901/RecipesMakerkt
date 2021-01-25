import kotlin.Int as Int

fun MakeRecipes(){
    print("::Creando Receta::")
}

fun ViewRecipes(){
    print("::Mis Recetas::")
}

fun main(args: Array<String>) {

    val option = '1'..'3'

    val MENU = """
        Selecciona la opcion Deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()

    var response: Int

    do {
        println(MENU)
        response = readLine()!!.toInt()
        when(response){
            1 -> MakeRecipes()
            2 -> ViewRecipes()
        }
        break
    }while (response != 3)

}