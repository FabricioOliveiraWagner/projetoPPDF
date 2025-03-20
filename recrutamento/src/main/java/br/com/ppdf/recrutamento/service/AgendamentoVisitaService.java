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

    public AgendamentoVisita getAgendamentoVisitaById(Integer id) {
        return repository.findById(id.longValue()).orElse(null);
    }

    public AgendamentoVisita getAgendamentoVisitaByName(String nome) {
        return repository.findByPessoaNome(nome);
    }

    public String cancelarAgendamentoVisita(Integer id) {
        repository.deleteById(id.longValue());
        return "AgendamentoVisita cancelada !! " + id;
    }

    public AgendamentoVisita atualizarAgendamentoVisita(Integer agendamentovisitaId,AgendamentoVisita agendamentovisita) {
        AgendamentoVisita existeAgendamentoVisita = repository.findById(agendamentovisitaId.longValue()).orElse(null);
        //existeAgendamentoVisita.setPessoa(agendamentovisita.getVisitante().);
       
        return repository.save(existeAgendamentoVisita);
    }
}