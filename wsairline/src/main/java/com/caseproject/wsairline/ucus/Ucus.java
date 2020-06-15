package com.caseproject.wsairline.ucus;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.caseproject.wsairline.havayoluSirketi.Havayolu;
import com.caseproject.wsairline.rota.Rota;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="UCUSLAR")
public class Ucus {
	@GeneratedValue
	@Id
	private Long id;
	private int kontenjan;
	private double fiyat;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "havayolu_id")
	@JsonIgnore
    private Havayolu havayolu;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rota_id")
	@JsonIgnore
	private Rota rota;
	
	private String rotaBilgisi;
	private String havayoluBilgi;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getKontenjan() {
		return kontenjan;
	}
	public void setKontenjan(int kontenjan) {
		this.kontenjan = kontenjan;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public Havayolu getHavayolu() {
		return havayolu;
	}
	public void setHavayolu(Havayolu havayolu) {
		this.havayolu = havayolu;
	}
	
	public Rota getRota() {
		return rota;
	}
	
	public void setRota(Rota rota) {
		this.rota = rota;
	}
	public String getRotaBilgisi() {
		return this.rota.getKalkisYeri() + " - " + this.rota.getVarisYeri();
	}
	
	public String getHavayoluBilgisi() {
		return this.havayolu.getIsim();
	}
	
	
	
	
}
