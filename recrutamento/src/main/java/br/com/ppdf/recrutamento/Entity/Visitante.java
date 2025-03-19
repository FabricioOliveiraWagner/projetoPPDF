package br.com.ppdf.recrutamento.Entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Visitante{

    private Long id;
    private String senha;
    private Pessoa pessoa;
}