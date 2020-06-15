package com.caseproject.wsairline.havaalanı;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HavaalanıService {

	@Autowired
	IHavaalanıRepository havaalanırepository;
	
	public void havaalaniEkle(Havaalanı havaalanı) {
		havaalanırepository.save(havaalanı);
	}

	public List<Havaalanı> havaalaniListele() {
		return havaalanırepository.findAll();
	}

	public List<Havaalanı> havaalaniAra(String ad) {
		return havaalanırepository.findByIsim(ad);
	}

}
