package br.com.theusmm.forum.repository

import br.com.theusmm.forum.model.Resposta
import org.springframework.data.jpa.repository.JpaRepository

interface RespostaRepository: JpaRepository<Resposta, Long>