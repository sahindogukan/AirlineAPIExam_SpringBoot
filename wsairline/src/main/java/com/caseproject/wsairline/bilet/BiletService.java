package com.caseproject.wsairline.bilet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BiletService {
	
	@Autowired
	IBiletRepository biletrepository;
	
	public void save(Bilet bilet) {
		
		// Kredi Kartı No Maskeleme
		
		int index = 0;
		String mask = "xxxxxx******xxxx";
		StringBuilder maskedNumber = new StringBuilder();
	    for (int i = 0; i < bilet.getKrediKartıNo().length(); i++) {
	        char c = mask.charAt(index);
	        // Karakter Kontrolü
	        if(Character.isDigit(bilet.getKrediKartıNo().charAt(i))) {
	        	if (c == 'x') {	
		        	maskedNumber.append(bilet.getKrediKartıNo().charAt(i));
		            index++;     
		        } else if (c == '*') {
		            maskedNumber.append(c);
		            index++;
		        } else {
		            maskedNumber.append(c);
		        }
	        }
	    }
	    bilet.setKrediKartıNo(maskedNumber.toString());
		biletrepository.save(bilet);
	}

	public List<Bilet> biletleriGetir() {
		return biletrepository.findAll();
		
	}

	public Bilet biletSorgula(Long yolcuTC) {
		return biletrepository.findByyolcuTC(yolcuTC);
	}

	public void biletSil(Long id) {
		biletrepository.deleteById(id);
		
	}}
