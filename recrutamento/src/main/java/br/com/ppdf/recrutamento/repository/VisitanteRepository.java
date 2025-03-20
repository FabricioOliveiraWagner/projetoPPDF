package br.com.ppdf.recrutamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ppdf.recrutamento.entity.Visitante;


@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {
    
   Visitante findByPessoaNome(String nome);
        
}