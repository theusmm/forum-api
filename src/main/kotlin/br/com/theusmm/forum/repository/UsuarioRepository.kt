package br.com.theusmm.forum.repository

import br.com.theusmm.forum.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository: JpaRepository<Usuario, Long> {
    fun findByEmail(username: String?): Usuario?
}