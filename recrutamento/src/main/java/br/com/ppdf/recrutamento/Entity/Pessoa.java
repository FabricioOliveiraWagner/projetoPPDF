package br.com.ppdf.recrutamento.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Pessoa {
    
    private Long id;
    private String nome;
    private String cpf;
    private Timestamp dataNascimento;
}
