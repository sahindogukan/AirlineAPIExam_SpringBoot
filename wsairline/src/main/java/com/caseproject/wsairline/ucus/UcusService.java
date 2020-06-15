package com.caseproject.wsairline.ucus;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UcusService {
	
	@Autowired
	IUcusRepository ucusrepository;
	
	public void ucusKaydet(Ucus ucus) {
		ucusrepository.save(ucus);
		
	}

	public Ucus kontenjanDuzenle(Long ucusid, int yeniKontenjan) {
		
		Ucus ucus = ucusrepository.getOne(ucusid);
		
		if(yeniKontenjan>ucus.getKontenjan())
		{
			int sayac = 0;
			int deger1 = ucus.getKontenjan();
			while(deger1 < yeniKontenjan) 
			{
				sayac++;
				deger1 = (deger1*110)/100;
			}
			
			for(int i=0; i < sayac; i++) {
				ucus.setFiyat((ucus.getFiyat()*110)/100);
			}
		}
		ucus.setKontenjan(yeniKontenjan);
		
		ucusrepository.save(ucus);
		
		return ucus;
		
		//System.out.println(ucus.getId());
		//System.out.println(ucus.getFiyat());
		//System.out.println(ucus.getKontenjan());
		//System.out.println(ucus.getHavayoluBilgisi());
		//System.out.println(ucus.getRotaBilgisi());
		
		
		
	}

	public List<Ucus> ucuslariListele() {
		return ucusrepository.findAll();
		
	}

	public Ucus ucusGetir(Long id) {
		return ucusrepository.getOne(id);
		
	}

}
