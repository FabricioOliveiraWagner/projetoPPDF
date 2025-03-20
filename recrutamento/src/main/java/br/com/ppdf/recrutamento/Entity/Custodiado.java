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
public class Custodiado{
    
    @Id
    @GeneratedValue
    private Integer id;
    private String numeroProntuario;
    private String vulgo;
    private Pessoa pessoa;
    private UnidadePenal unidade;
}