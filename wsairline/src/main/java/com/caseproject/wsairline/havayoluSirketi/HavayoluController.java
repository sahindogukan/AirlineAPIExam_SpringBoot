package com.caseproject.wsairline.havayoluSirketi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caseproject.wsairline.ucus.Ucus;

@RestController
@RequestMapping("/api")
public class HavayoluController {
	
	@Autowired
	HavayoluService havayoluservice;
	
	@PostMapping("/havayoluSirketiEkle")
	public void havayoluEkle(@RequestBody Havayolu havayolu) {
		havayoluservice.havayoluEkle(havayolu);
	}
	
	@GetMapping("/havayoluSirketiListele")
	public List<Havayolu> havayoluListele(){
		return havayoluservice.havayoluListele();
	}
	
	
	@GetMapping("/havayoluSirketiAra/{ad}")
	public Havayolu havayoluAra(@PathVariable String ad) {
		return havayoluservice.havayoluAra(ad);
	}
	
	
}
