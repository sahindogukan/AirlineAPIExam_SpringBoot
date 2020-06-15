package com.caseproject.wsairline.havayoluSirketi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.caseproject.wsairline.ucus.Ucus;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="HAVAYOLU")
public class Havayolu {

	@Id
	@GeneratedValue
	private Long id;
	private String isim;
	
	@OneToMany(mappedBy="havayolu", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Ucus> ucus;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<Ucus> getUcus() {
		return ucus;
	}

	public void setUcus(List<Ucus> ucus) {
		this.ucus = ucus;
	}

	
	
	

	
	
}
