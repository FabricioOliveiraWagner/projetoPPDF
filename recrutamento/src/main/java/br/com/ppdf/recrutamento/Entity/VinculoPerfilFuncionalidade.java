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
public class VinculoPerfilFuncionalidade{
    
    @Id
    @GeneratedValue
    private Integer id;
    private Perfil perfil;
    private Funcionalidade funcionalidade;

}