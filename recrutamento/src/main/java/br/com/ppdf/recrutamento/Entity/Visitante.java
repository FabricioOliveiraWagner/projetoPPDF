package br.com.ppdf.recrutamento.entity;

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
public class Visitante{

    @Id
    @GeneratedValue
    private Integer id;
    private String senha;
    private Pessoa pessoa;
}