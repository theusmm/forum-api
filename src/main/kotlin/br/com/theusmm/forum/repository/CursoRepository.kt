package br.com.theusmm.forum.repository

import br.com.theusmm.forum.model.Curso
import org.springframework.data.jpa.repository.JpaRepository

interface CursoRepository: JpaRepository<Curso, Long> {
}