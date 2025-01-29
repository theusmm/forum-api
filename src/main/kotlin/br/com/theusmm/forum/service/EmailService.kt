package br.com.theusmm.forum.service

import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service


// USANDO O MAILTRAP.IO
@Service
class EmailService(
    private val javaMailSender: JavaMailSender,
) {
    fun notificar(autor: String) {
        val message = SimpleMailMessage()

        message.subject = "[Forum] Resposta Recebida"
        message.text = "Ola, o seu tópico foi respondido. Vamos lá conferir?"
        message.setTo(autor)

        javaMailSender.send(message)
    }
}