package br.com.theusmm.forum.service

import br.com.theusmm.forum.model.Usuario
import br.com.theusmm.forum.repository.UsuarioRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class UsuarioService (private val repository: UsuarioRepository): UserDetailsService {

    fun buscarPorId(id: Long): Usuario {
        return repository.findByIdOrNull(id) ?: throw RuntimeException()
    }

    override fun loadUserByUsername(username: String?): UserDetails {
        val usuario = repository.findByEmail(username) ?: throw java.lang.RuntimeException()
        return UserDetail(usuario)
    }
}