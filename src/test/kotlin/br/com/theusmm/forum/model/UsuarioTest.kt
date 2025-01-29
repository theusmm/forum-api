package br.com.theusmm.forum.model

object UsuarioTest {
    fun build() = Usuario(
        id = 1,
        nome = "João",
        email = "jvc.martins",
        password = "123"
    )

    fun buildToToken() = Usuario(
        nome = "Ana da Silva",
        email = "ana@email.com",
        password = "123456"
    )
}