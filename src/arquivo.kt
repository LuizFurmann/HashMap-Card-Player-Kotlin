fun main(args: Array<String>) {

    val cofre: HashMap<String, Int> = hashMapOf(
        "V" to 1,
        "B" to 5,
        "A" to 7,
        "L" to 0,
        "P" to 0
    )
    var jogador = Jogador("Player1", cofre)

    val valorCarta: HashMap<String, Int> = hashMapOf(
        "V" to 3,
        "B" to 5,
        "A" to 2,
        "L" to 0,
        "P" to 0
    )
    var carta1 = Card("5", valorCarta)

    print(verifica(cofre,valorCarta))
}

fun verifica(hashmap1: HashMap<String, Int>, hashpmap2: HashMap<String, Int>): Boolean{
    var resultado : Boolean = true
    for ((key, value) in hashmap1) {
        if(hashmap1["V"]!! >= hashpmap2["V"]!! && hashmap1["B"]!! >= hashpmap2["B"]!! && hashmap1["A"]!! >= hashpmap2["A"]!!){
            resultado = true
        }else{
            resultado = false
        }
    }
    return resultado
}