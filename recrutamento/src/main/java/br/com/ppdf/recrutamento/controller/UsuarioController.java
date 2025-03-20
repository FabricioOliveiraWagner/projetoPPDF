
package br.com.ppdf.recrutamento.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import br.com.ppdf.recrutamento.dto.AgendamentoVisitaDTO;
import br.com.ppdf.recrutamento.entity.AgendamentoVisita;
import br.com.ppdf.recrutamento.service.AgendamentoVisitaService;
import br.com.ppdf.recrutamento.service.UsuarioService;




@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private AgendamentoVisitaService agendamentoVisitaService;
   

    @PostMapping("/agendarVisita")
    public AgendamentoVisita agendarVisita(@RequestBody AgendamentoVisita visita) {

        return agendamentoVisitaService.criarAgendamentoVisita(visita);
    }
}