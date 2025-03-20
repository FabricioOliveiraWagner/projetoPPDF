package br.com.ppdf.recrutamento.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ppdf.recrutamento.entity.Custodiado;
import br.com.ppdf.recrutamento.repository.CustodiadoRepository;

@Service
public class CustodiadoService {

    @Autowired
    private CustodiadoRepository repository;

    public Custodiado saveCustodiado(Custodiado custodiado) {
        return repository.save(custodiado);
    }

    public List<Custodiado> getCustodiados() {
        return repository.findAll();
    }

    public Custodiado getCustodiadoById(Long id) {
        return repository.findById(id ).orElse(null);
    }

    public Custodiado getCustodiadoByName(String nome) {
        return repository.findByPessoaNome(nome);
    }
    public Custodiado getCustodiadoByNumeroProntuario(String numero) {
        return repository.findByNumeroProntuario(numero);
    }

    public Custodiado updateCustodiado(Long custodiadoId,Custodiado custodiado) {
        Custodiado existeCustodiado = repository.findById(custodiadoId ).orElse(null);
        //existeCustodiado.setName(custodiado.getName());
        //existeCustodiado.setQuantity(custodiado.getQuantity());
       // existeCustodiado.setPrice(custodiado.getPrice());
        return repository.save(existeCustodiado);
    }
}