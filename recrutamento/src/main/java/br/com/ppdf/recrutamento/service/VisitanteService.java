
package br.com.ppdf.recrutamento.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.ppdf.recrutamento.entity.Visitante;
import br.com.ppdf.recrutamento.repository.VisitanteRepository;

@Service
public class VisitanteService {

    @Autowired
    private VisitanteRepository repository;

    public Visitante saveVisitante(Visitante visita) {
        return repository.save(visita);
    }
  
    public Visitante getVisitanteByName(String nome) {
        return repository.findByPessoaNome(nome);
    }

  /*   public Visitante updateVisitante(int visitaId,Visita visita) {
        Visita existeVisita = repository.findById(visitaId).orElse(null);
        existeVisita.setName(visita.getName());
        existeVisita.setQuantity(visita.getQuantity());
        existeVisita.setPrice(visita.getPrice());
        return repository.save(existeVisita);
    }
        */
}