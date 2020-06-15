package com.caseproject.wsairline.havayoluSirketi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.caseproject.wsairline.ucus.Ucus;

public interface IHavayoluRepository extends JpaRepository<Havayolu, Long> {
	Havayolu findByIsim(String ad);
}
