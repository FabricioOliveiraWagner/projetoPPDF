package br.com.ppdf.recrutamento.Entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Custodiado{
    
    private Long id;
    private String numeroProntuario;
    private String vulgo;
    private Pessoa pessoa;
    private UnidadePenal unidade;
}