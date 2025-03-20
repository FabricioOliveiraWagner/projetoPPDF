package br.com.ppdf.recrutamento.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pessoa {
    
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private String cpf;
    private Timestamp dataNascimento;
}
