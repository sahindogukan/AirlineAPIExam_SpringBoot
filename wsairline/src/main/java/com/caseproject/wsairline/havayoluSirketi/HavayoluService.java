package com.caseproject.wsairline.havayoluSirketi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caseproject.wsairline.ucus.IUcusRepository;
import com.caseproject.wsairline.ucus.Ucus;

@Service
public class HavayoluService {
	@Autowired
	IHavayoluRepository havayolurepository;
	

	public Havayolu havayoluAra(String ad) {
		return havayolurepository.findByIsim(ad);
		
	}

	public void havayoluEkle(Havayolu havayolu) {
		
		havayolurepository.save(havayolu);
	}

	public List<Havayolu> havayoluListele() {
		return havayolurepository.findAll();
		
	}



}
