package com.example.fintech.repositories;

import com.example.fintech.domain.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface InvestimentoRepository extends JpaRepository<Investimento,Long> {
}
