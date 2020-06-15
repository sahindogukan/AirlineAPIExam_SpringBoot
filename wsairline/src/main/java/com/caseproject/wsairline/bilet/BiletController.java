package com.caseproject.wsairline.bilet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BiletController {
	
	@Autowired
	BiletService biletservice;
	
	@PostMapping("/biletAl")
	public void biletOlustur(@RequestBody Bilet bilet) {
		biletservice.save(bilet);
	}
	
	@GetMapping("/biletleriGetir")
	public List<Bilet> biletleriGetir() {
		return biletservice.biletleriGetir();
	}
	
	@GetMapping("/biletSorgula/{yolcuTC}")
	public Bilet biletSorgula(@PathVariable Long yolcuTC) {
		return biletservice.biletSorgula(yolcuTC);
	}
	
	@DeleteMapping("/biletIptalEt/{id}")
	public String biletSil(@PathVariable Long id) {
		biletservice.biletSil(id);
		return "Bilet başarıyla iptal edildi.";
	}
	
	
}
