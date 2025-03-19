package br.com.ppdf.recrutamento.Entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Usuario{

    private Long id;
    private String email;
    private String senha;
    private Perfil perfil;
    private Pessoa pessoa;

}