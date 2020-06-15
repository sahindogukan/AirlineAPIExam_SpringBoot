package com.caseproject.wsairline.ucus;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caseproject.wsairline.ucus.UcusService;

@RestController
@RequestMapping("/api")
public class UcusController {
	
	@Autowired
	UcusService ucusservice;
	
	@PostMapping("/ucusKaydet")
	public String  ucusKaydet(@RequestBody Ucus ucus) {
		ucusservice.ucusKaydet(ucus);
		return "Ucus basarıyla kaydedildi.";
	}
	
	@GetMapping("/ucusGetir/{ucusid}")
	public Ucus ucusGetir(@PathVariable Long ucusid){
		return ucusservice.ucusGetir(ucusid);
	}
	
	@PostMapping("/ucus/kontenjanDuzenle/{ucusid}")
	public String kontenjanDuzenle(@PathVariable Long ucusid, @RequestBody Integer yeniKontenjan) {
		Ucus ucus = ucusservice.kontenjanDuzenle(ucusid,yeniKontenjan);
		return ucusid +" id'li ucus kontenjanı " + ucus.getKontenjan()  +", ucus fiyatı ise "+ ucus.getFiyat() + "  olarak otomatik güncellendi.";
	}
	
	@GetMapping("/ucuslariListele")
	public List<Ucus> ucuslariListele(){
		return ucusservice.ucuslariListele();
	}
	
}
