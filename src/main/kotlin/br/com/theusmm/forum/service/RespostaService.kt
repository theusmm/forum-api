package br.com.theusmm.forum.service

import br.com.theusmm.forum.model.Resposta
import br.com.theusmm.forum.repository.RespostaRepository
import org.springframework.stereotype.Service

@Service
class RespostaService(
    private val respostaRepository: RespostaRepository,
    private val emailService: EmailService
) {
    fun salvar(resposta: Resposta) {
        respostaRepository.save(resposta)

        val emailAutor = resposta.topico.autor.email
        emailService.notificar(emailAutor)
    }
}