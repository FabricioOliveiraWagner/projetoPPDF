package br.com.ppdf.recrutamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import br.com.ppdf.recrutamento.entity.AgendamentoVisita;
import br.com.ppdf.recrutamento.service.AgendamentoVisitaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AgendamentoVisitaController{

    @Autowired
    private AgendamentoVisitaService service;

    @GetMapping("path")
    public List<AgendamentoVisita> getAgendamentoVisitas(){

        return service.getAgendamentoVisitas();
    }
       @PutMapping("/atualizarVisita/{id}")
    public AgendamentoVisita atualizarVisita(@PathVariable Long id, @RequestBody AgendamentoVisita visita) {
        return service.atualizarAgendamentoVisita(id, visita);
    }
   
     @PostMapping("path")
    public AgendamentoVisita agendarVisita(@RequestBody AgendamentoVisita agendamento){

        return service.criarAgendamentoVisita(agendamento);

    }
       

    

}