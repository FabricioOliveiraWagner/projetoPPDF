package br.com.ppdf.recrutamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ppdf.recrutamento.entity.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {

}