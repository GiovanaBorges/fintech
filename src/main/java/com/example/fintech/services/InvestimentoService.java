package com.example.fintech.services;

import com.example.fintech.domain.Investimento;
import com.example.fintech.domain.User;
import com.example.fintech.repositories.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestimentoService {
    @Autowired
    InvestimentoRepository repository;

    public ResponseEntity<Optional<Investimento>> createInvest(Investimento invest){
        Optional<Investimento> newInvest = Optional.of(repository.save(invest));

        if(newInvest.isPresent()){
            return ResponseEntity.status(200).body(newInvest);
        }else{
            return ResponseEntity.badRequest().body(newInvest);
        }
    }

    public ResponseEntity deletedInvestimento(Long id) throws Exception {
        Optional<Investimento> userFounded = Optional.of(repository.getById(id));

        if(userFounded.isPresent()){
            repository.deleteById(id);
        }else{
            throw new Exception("Investimento not founded");
        }

        return ResponseEntity.status(404).build();
    }

    public List<Investimento> getAllInvestimento(){
        return this.repository.findAll();
    }
}
