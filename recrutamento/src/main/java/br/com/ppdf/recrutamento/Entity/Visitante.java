package br.com.ppdf.recrutamento.entity;

import java.io.Serializable;

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
public class Visitante implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String senha;
    private Pessoa pessoa;
}