import kotlin.Int as Int

fun MakeRecipes(){
    print("::Hacer Receta::")
    println("""
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
    """.trimIndent())
}

fun ViewRecipes(){
    print("::Ver Recetas::")
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
            3 -> continue
        }
        break
    }while (response != 3)

}