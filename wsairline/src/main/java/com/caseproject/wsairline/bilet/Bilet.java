package com.caseproject.wsairline.bilet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.caseproject.wsairline.havaalanı.Havaalanı;
import com.caseproject.wsairline.havayoluSirketi.Havayolu;
import com.caseproject.wsairline.ucus.Ucus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;


@Entity
@Table(name="BILET")
public class Bilet {

	@Id
	@GeneratedValue
	private Long id;
	private String yolcuAdı;
	private String yolcuSoyadı;
	private Long yolcuTC;
	private String krediKartıNo;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "havayolu_id")
	@JsonIgnore
	private Havayolu havayolu;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ucus_id")
	@JsonIgnore
	private Ucus ucus;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getYolcuAdı() {
		return yolcuAdı;
	}
	public void setYolcuAdı(String yolcuAdı) {
		this.yolcuAdı = yolcuAdı;
	}
	public String getYolcuSoyadı() {
		return yolcuSoyadı;
	}
	public void setYolcuSoyadı(String yolcuSoyadı) {
		this.yolcuSoyadı = yolcuSoyadı;
	}
	public Long getYolcuTC() {
		return yolcuTC;
	}
	public void setYolcuTC(Long yolcuTC) {
		this.yolcuTC = yolcuTC;
	}
	
	
	public String getKrediKartıNo() {
		return krediKartıNo;
	}
	public void setKrediKartıNo(String krediKartıNo) {
		this.krediKartıNo = krediKartıNo;
	}
	@Override
	public String toString() {
		return "Bilet [id=" + id + ", yolcuAdı=" + yolcuAdı + ", yolcuSoyadı=" + yolcuSoyadı + ", yolcuTC=" + yolcuTC
				+ "]";
	}
	
	
}
