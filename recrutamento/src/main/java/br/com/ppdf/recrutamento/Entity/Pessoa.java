package br.com.ppdf.recrutamento.Entity;

import jakarta.persistence.Entity;

@Entity
public class Pessoa {
    
    private Long id;
    private String nome;
    private String cpf;
    private DateTime dataNascimento;
}
