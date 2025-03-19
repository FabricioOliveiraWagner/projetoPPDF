package br.com.ppdf.recrutamento.Entity;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class VinculoPerfilFuncionalidade{
    
    private Long id;
    private Perfil perfil;
    private Funcionalidade funcionalidade;

}