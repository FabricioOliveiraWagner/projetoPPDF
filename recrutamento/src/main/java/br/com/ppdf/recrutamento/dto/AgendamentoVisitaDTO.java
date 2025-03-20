package br.com.ppdf.recrutamento.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoVisitaDTO {
    private String nome;
    private String numeroProntuario;
    private LocalDateTime dataHora;

}