package com.example.fintech.controllers;

import com.example.fintech.domain.Investimento;
import com.example.fintech.domain.User;
import com.example.fintech.repositories.InvestimentoRepository;
import com.example.fintech.services.InvestimentoService;
import com.example.fintech.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("investimento")
public class InvestimentoController {
    @Autowired
    InvestimentoService service;

    @GetMapping
    public ResponseEntity getAllInvestimento(){
        List<Investimento> invest = service.getAllInvestimento();
        return ResponseEntity.accepted().body(invest);
    }

    @PostMapping
    public ResponseEntity createInvestimento(@RequestBody Investimento investimento){
        return service.createInvest(investimento);
    }

    @DeleteMapping("/{id}")
    public void deleteInvestimento(@PathVariable Long id) throws Exception {
        service.deletedInvestimento(id);
    }
}
