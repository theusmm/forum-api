package br.com.theusmm.forum.mapper

import br.com.theusmm.forum.dto.NovoTopicoForm
import br.com.theusmm.forum.model.Topico
import br.com.theusmm.forum.service.CursoService
import br.com.theusmm.forum.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService,
): Mapper<NovoTopicoForm, Topico> {

    override fun map(t: NovoTopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }
}
