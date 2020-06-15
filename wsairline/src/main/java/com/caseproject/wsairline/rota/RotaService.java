package com.caseproject.wsairline.rota;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RotaService {
	
	@Autowired
	IRotaRepository rotarepository;
	
	
	public void rotaOlustur(Rota rota) {
		rotarepository.save(rota);
		
	}


	public List<Rota> rotaAraKalkis(String rota) {
		return rotarepository.findByKalkisYeri(rota);
	}
	public List<Rota> rotaAraVaris(String rota) {
		return rotarepository.findByVarisYeri(rota);
	}

}
