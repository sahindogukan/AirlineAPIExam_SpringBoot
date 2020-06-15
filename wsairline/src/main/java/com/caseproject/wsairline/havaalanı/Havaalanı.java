package com.caseproject.wsairline.havaalanı;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Havaalanı {
	@Id
	@GeneratedValue
	private Long id;
	private String isim;
	private String sehir;
	private String ulke;
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
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getUlke() {
		return ulke;
	}
	public void setUlke(String ulke) {
		this.ulke = ulke;
	}
	@Override
	public String toString() {
		return "Havaalanı [id=" + id + ", isim=" + isim + ", sehir=" + sehir + ", ulke=" + ulke + "]";
	}
	
}
