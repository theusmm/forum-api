package br.com.theusmm.forum.service

import br.com.theusmm.forum.model.Curso
import br.com.theusmm.forum.repository.CursoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.lang.RuntimeException
import java.util.Arrays

@Service
class CursoService(private val repositoy: CursoRepository) {

    fun buscarPorId(id: Long): Curso {
        return repositoy.findByIdOrNull(id) ?: throw RuntimeException()
    }
}