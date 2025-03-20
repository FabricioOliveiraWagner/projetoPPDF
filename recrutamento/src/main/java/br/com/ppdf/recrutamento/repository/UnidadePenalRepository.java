package br.com.ppdf.recrutamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ppdf.recrutamento.entity.UnidadePenal;

@Repository
public interface UnidadePenalRepository extends JpaRepository<UnidadePenal, Long> {

}