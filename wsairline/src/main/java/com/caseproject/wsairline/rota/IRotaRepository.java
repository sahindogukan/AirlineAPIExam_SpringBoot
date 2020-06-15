package com.caseproject.wsairline.rota;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IRotaRepository extends JpaRepository<Rota, Long> {
	List<Rota> findByKalkisYeri(String rota);
	List<Rota> findByVarisYeri(String rota);
}
