package com.caseproject.wsairline.rota;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.caseproject.wsairline.ucus.Ucus;



@Entity
@Table(name="ROTALAR")
public class Rota {
	@Id
	@GeneratedValue
	private Long id;
	private String kalkisYeri;
	private String varisYeri;
	
	@OneToMany(mappedBy="rota", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Ucus> ucuslar;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKalkisYeri() {
		return kalkisYeri;
	}
	public void setKalkisYeri(String kalkisYeri) {
		this.kalkisYeri = kalkisYeri;
	}
	public String getVarisYeri() {
		return varisYeri;
	}
	public void setVarisYeri(String varisYeri) {
		this.varisYeri = varisYeri;
	}
	
	public List<Ucus> getUcuslar() {
		return ucuslar;
	}
	public void setUcuslar(List<Ucus> ucuslar) {
		this.ucuslar = ucuslar;
	}
	@Override
	public String toString() {
		return "Rota [id=" + id + ", kalkisYeri=" + kalkisYeri + ", varisYeri=" + varisYeri + "]";
	}
	
}
