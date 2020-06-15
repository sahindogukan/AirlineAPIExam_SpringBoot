package com.caseproject.wsairline.havaalanı;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IHavaalanıRepository extends JpaRepository<Havaalanı, Long> {
	List<Havaalanı> findByIsim(String ad);
}
