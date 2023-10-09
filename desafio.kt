// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, var gral: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        // Verifica se o usuário já está inscrito
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("Seja bem vindo ${usuario.nome}, você foi matriculado no curso de $nome, veja a grade do curso:$conteudos")
        } else {
            println("Usuário ${usuario.nome} já está matriculado nesta formação")
        }
    }
}

fun main() {


    val formacao =
    Formacao(
        nome="Analise e desenvolvimento de sistemas com Kotlin",
        conteudos = listOf(

            ConteudoEducacional(
                nome = "Kotlin",
                duracao =40,
                gral = Nivel.DIFICIL

            ),
            ConteudoEducacional(
                nome = "Jetpack Compose",
                duracao = 30,
                gral = Nivel.INTERMEDIARIO

            ),
            ConteudoEducacional(
                nome = "Xml",
                duracao = 20,
                gral = Nivel.BASICO

            ),

            ConteudoEducacional(
                nome = "Coroutines",
                duracao = 15,
                gral = Nivel.BASICO

            ),
            ConteudoEducacional(
                nome = "Retrofit",
                duracao = 15,
                gral = Nivel.INTERMEDIARIO

            ),
            ConteudoEducacional(
                nome = "Ktor",
                duracao = 20,
                gral = Nivel.INTERMEDIARIO

            ),

            ConteudoEducacional(
                nome = "Spring",
                duracao = 15,
                gral = Nivel.INTERMEDIARIO

            ),

            )
    )

    val usuario = Usuario("Adriano Almeida dos Santos")
    formacao.matricular(usuario = usuario)


}
