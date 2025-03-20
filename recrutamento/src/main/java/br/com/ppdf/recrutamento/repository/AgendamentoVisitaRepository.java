package br.com.ppdf.recrutamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ppdf.recrutamento.entity.AgendamentoVisita;

@Repository
public interface AgendamentoVisitaRepository extends JpaRepository<AgendamentoVisita, Long> {

    AgendamentoVisita findByVisitantePessoaNome(String nome);

}