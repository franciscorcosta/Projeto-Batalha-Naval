var numLinhas = -1
var numColunas = -1

var tabuleiroHumano: Array<Array<Char?>> = emptyArray()
var tabuleiroComputador: Array<Array<Char?>> = emptyArray()

var tabuleiroPalpitesDoHumano: Array<Array<Char?>> = emptyArray()
var tabuleiroPalpitesDoComputador: Array<Array<Char?>> = emptyArray()


fun tamanhoTabuleiroValido(numLinhas: Int, numColunas: Int): Boolean {
    return when {
        numLinhas == 4 && numColunas == 4 -> true
        numLinhas == 5 && numColunas == 5 -> true
        numLinhas == 7 && numColunas == 7 -> true
        numLinhas == 8 && numColunas == 8 -> true
        numLinhas == 10 && numColunas == 10 -> true
        else -> false
    }
}

fun calculaEstatisticas(tabuleiroPalpites: Array<Array<Char?>>): Array<Int>{
    return arrayOf(5)
}




fun calculaNaviosFaltaAfundar(tabuleiroPalpites: Array<Array<Char?>>): Array<Int>{
    return arrayOf(9)
}



fun processaCoordenadas(coordenadas: String, numLinhas: Int, numColunas: Int): Pair<Int,Int>? {




    return Pair(1,1)


}


fun calculaNumNavios(numLinhas: Int, numColunas: Int): Array<Int> {

    return arrayOf(1)
}

fun criaTabuleiroVazio(numLinhas: Int, numColunas: Int): Array<Array<Char?>> {



    return arrayOf()
}

fun coordenadaContida(tabuleiro: Array<Array<Char?>>,linha: Int, coluna: Int,): Boolean {
    return false
}

fun limparCoordenadasVazias(coordenadas: Array<Pair<Int,Int>>): Array<Pair<Int,Int>> {





    return arrayOf(Pair(2,5),Pair(3,5),Pair(4,1))
}

fun juntarCoordenadas(coordenadas1: Array<Pair<Int,Int>>, coordenadas2: Array<Pair<Int,Int>>): Array<Pair<Int,Int>> {
    return emptyArray()
}

fun gerarCoordenadasNavio(tabuleiro: Array<Array<Char?>>,
                          numLinhas: Int,
                          numColunas: Int,
                          orientacao: String,
                          dimensao: Int): Array<Pair<Int,Int>> {
    return emptyArray()
}

fun gerarCoordenadasFronteira(tabuleiro: Array<Array<Char?>>,
                              numLinhas: Int,
                              numColunas: Int,
                              orientacao: String,
                              dimensao: Int): Array<Pair<Int,Int>> {
    return emptyArray()
}

fun estaLivre(tabuleiro: Array<Array<Char?>>, coordenadas: Array<Pair<Int,Int>>): Boolean {
    return false
}

fun insereNavioSimples(tabuleiro: Array<Array<Char?>>, linhas: Int, coluna: Int, dimensao: Int): Boolean {
    return true
}

fun insereNavio(tabuleiro: Array<Array<Char?>>,
                linha:Int,
                coluna: Int,
                orientacao: String,
                dimensao: Int): Boolean {
    return false
}


fun preencheTabuleiroComputador(tabuleiro: Array<Array<Char?>>,navios:Array<Int>) {

}

fun navioCompleto(tabuleiro: Array<Array<Char?>>, linha: Int,coluna: Int): Boolean {
    return true
}

fun lancarTiro(tabuleirorealcomputador: Array<Array<Char?>>,
               tabuleiropalpiteshumano: Array<Array<Char?>>,
               coordenadas: Pair<Int,Int>): String {
    return ""
}

fun geraTiroComputador(tabuleiropalpitescomputador: Array<Array<Char?>>): Pair<Int,Int> {
    return Pair(2,4)
}


fun contarNaviosDeDimensao(tabuleiro: Array<Array<Char?>>, dimensao: Int): Int {
    return 1
}

fun venceu(tabuleiro: Array<Array<Char?>>): Boolean {
    return true
}

fun lerJogo(ficheiro:String, tabuleiro:Int):Array<Array<Char?>> {
return arrayOf()
}

fun gravarJogo(ficheiro: String,
               tabuleirorealhumano: Array<Array<Char?>>,
               tabuleiropalpiteshumano: Array<Array<Char?>>,
               tabuleirorealcomputador: Array<Array<Char?>>,
               tabuleiropalpitescomputador: Array<Array<Char?>>) {

}







fun criaLegendaHorizontal(numColunas: Int): String {
    return if (numColunas <= 0) {
        ""
    } else if (numColunas == 1) {
        "A"
    } else {
        criaLegendaHorizontal(numColunas - 1) + " | " + ('A' + numColunas - 1)
    }
}


fun obtemMapa(tabuleiro: Array<Array<Char?>>, real:Boolean): Array<String> {
   return arrayOf("A")
}


fun definirTabuleiroENavios() {


}


fun menuJogar() {
    println("!!! POR IMPLEMENTAR,tente novamente")
}

fun menuGravarFicheiro() {
    println("!!! POR IMPLEMENTAR, tente novamente")
}

fun menuLerFicheiro() {
    println("!!! POR IMPLEMENTAR, tente novamente")
}


fun main() {

    while (true) {
        println("\n> > Batalha Naval < <\n")
        println("1- Definir Tabuleiro e Navios")
        println("2- Jogar")
        println("3- Gravar")
        println("4- Ler")
        println("0- Sair\n")


        when (readlnOrNull()) {
            "1" -> definirTabuleiroENavios()
            "2" -> menuJogar()
            "3" -> menuGravarFicheiro()
            "4" -> menuLerFicheiro()
            "0" -> return
            else -> println("!!! Opcao invalida, tente novamente")

        }

    }

}














