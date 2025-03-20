package br.com.ppdf.recrutamento.service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.ppdf.recrutamento.entity.Visitante;
import br.com.ppdf.recrutamento.dto.AgendamentoVisitaDTO;



@Service
public class UsuarioService {


    @Autowired
    private final VisitanteService visitanteService;

    public UsuarioService(VisitanteService visitanteService) {
        this.visitanteService = visitanteService;
    }

   
    public void agendarVisita(AgendamentoVisitaDTO agendamento) {
        
        Visitante visitante = visitanteService.getVisitanteByName(agendamento.getNome());
        
        System.out.println("Visita agendada para o usuário " + visitante.getPessoa().getNome() + " na data " + agendamento.getDataHora());
    }


    public boolean validateUser(String username, String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateUser'");
    }


    public String generateOAuth2Token(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateOAuth2Token'");
    }
}