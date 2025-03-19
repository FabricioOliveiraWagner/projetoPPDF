package br.com.ppdf.recrutamento.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class AgendamentoVisita{

    private Long id;
    private Custodiado custodiado;
    private Visitante visitante;
    private Timestamp dataHoraAgendamento;
    private Status status;
}