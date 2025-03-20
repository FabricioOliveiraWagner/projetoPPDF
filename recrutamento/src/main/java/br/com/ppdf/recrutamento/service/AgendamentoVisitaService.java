package br.com.ppdf.recrutamento.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

import br.com.ppdf.recrutamento.repository.AgendamentoVisitaRepository;
import br.com.ppdf.recrutamento.entity.AgendamentoVisita;


@Service
public class AgendamentoVisitaService {

    @Autowired
    private AgendamentoVisitaRepository repository;

    public AgendamentoVisita criarAgendamentoVisita(AgendamentoVisita agendamentovisita) {
        return repository.save(agendamentovisita);
    }

    public List<AgendamentoVisita> getAgendamentoVisitas() {
        return repository.findAll();
    }

    public AgendamentoVisita getAgendamentoVisitaById(Long id) {
        return repository.findById(id ).orElse(null);
    }

    public AgendamentoVisita getAgendamentoVisitaByName(String nome) {
        return repository.findByVisitantePessoaNome(nome);
    }

    public String cancelarAgendamentoVisita(Long id) {
        repository.deleteById(id );
        return "AgendamentoVisita cancelada !! " + id;
    }

    public AgendamentoVisita atualizarAgendamentoVisita(Long agendamentovisitaId,AgendamentoVisita agendamentovisita) {
        AgendamentoVisita existeAgendamentoVisita = repository.findById(agendamentovisitaId ).orElse(null);
        //existeAgendamentoVisita.setPessoa(agendamentovisita.getVisitante().);
       
        return repository.save(existeAgendamentoVisita);
    }
}