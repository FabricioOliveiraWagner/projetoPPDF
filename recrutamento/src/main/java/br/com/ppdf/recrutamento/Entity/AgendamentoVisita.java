package br.com.ppdf.recrutamento.entity;

import java.io.Serializable;
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
public class AgendamentoVisita implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private Custodiado custodiado;
    private Visitante visitante;
    private Timestamp dataHoraAgendamento;
    private Status status;
}