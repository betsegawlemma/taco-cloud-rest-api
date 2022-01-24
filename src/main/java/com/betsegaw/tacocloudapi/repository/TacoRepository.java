package com.betsegaw.tacocloudapi.repository;

import com.betsegaw.tacocloudapi.model.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoRepository extends JpaRepository<Taco, Long> {
}
