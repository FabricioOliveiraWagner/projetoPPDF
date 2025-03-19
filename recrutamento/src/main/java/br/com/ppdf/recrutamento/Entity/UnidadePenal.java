package br.com.ppdf.recrutamento.Entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class UnidadePenal{
    
    private Long id;
    private String nome;
    private String descricao;
}