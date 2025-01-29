package br.com.theusmm.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class AtualizacaoTopicoForm(
    @field: NotNull
    val id: Long,

    @field: Size(min = 5, max = 100)
    @field: NotEmpty
    val titulo: String,

    @field: NotEmpty
    val mensagem: String
)