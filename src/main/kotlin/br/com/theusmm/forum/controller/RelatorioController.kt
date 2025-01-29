package br.com.theusmm.forum.controller

import br.com.theusmm.forum.service.TopicoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("relatorios")
class RelatorioController(
    private val topicoService: TopicoService
) {

    @GetMapping
    fun relaotorio(model: Model): String {
        model.addAttribute("topicosPorCategorias", topicoService.relatorio())
        return "relatorio"
    }
}