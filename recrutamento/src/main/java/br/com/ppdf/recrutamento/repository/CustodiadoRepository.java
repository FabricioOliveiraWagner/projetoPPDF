package br.com.ppdf.recrutamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ppdf.recrutamento.entity.Custodiado;

@Repository
public interface CustodiadoRepository extends JpaRepository<Custodiado, Long> {
    Custodiado findByPessoaNome(String nome);
    Custodiado findByNumeroProntuario(String numeroProntuario);
}