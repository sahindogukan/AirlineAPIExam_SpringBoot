package com.caseproject.wsairline.bilet;


import org.springframework.data.jpa.repository.JpaRepository;



public interface IBiletRepository extends JpaRepository<Bilet, Long> {
	
	Bilet findByyolcuTC(Long yolcuTC);
	
}
