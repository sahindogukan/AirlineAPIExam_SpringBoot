package com.caseproject.wsairline.havaalanı;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HavaalanıController {
	
	@Autowired
	HavaalanıService havaalanıservice;
	
	@PostMapping("/api/havaalaniEkle")
	public void havaalaniEkle(@RequestBody Havaalanı havaalanı) {
		havaalanıservice.havaalaniEkle(havaalanı);
	}
	
	@GetMapping("/api/havaalaniListele")
	public List<Havaalanı> havaalaniEkle() {
		return havaalanıservice.havaalaniListele();
	}
	
	@GetMapping("/api/havaalaniAra/{ad}")
	public List<Havaalanı> havaalaniAra(@PathVariable String ad ) {
		return havaalanıservice.havaalaniAra(ad);
	}
}
