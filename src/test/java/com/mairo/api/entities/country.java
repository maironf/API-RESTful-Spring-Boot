package com.mairo.api.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class country implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9201512365489265642L;
	
	private String code;
	private String name;
	private String continent;
	private String region;
	private String surfacearea;
	private String indepYear;
	private String population;
	private String lifeexpectaty;
	private String gnp;
	private String gnpoid;
	private String localname;
	private String governmentform;
	private String headofstate;
	private Integer capital;
	private String code2;
	
	@Id
	@Column(name = "Code")
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	@Column(name = "Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "Continent")
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	@Column(name = "Region")
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Column(name = "SurfaceArea")
	public String getSurfacearea() {
		return surfacearea;
	}
	public void setSurfacearea(String surfacearea) {
		this.surfacearea = surfacearea;
	}
	@Column(name = "IndepYear")
	public String getIndepYear() {
		return indepYear;
	}
	public void setIndepYear(String indepYear) {
		this.indepYear = indepYear;
	}
	@Column(name = "Population")
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	@Column(name = "LifeExpectancy")
	public String getLifeexpectaty() {
		return lifeexpectaty;
	}
	public void setLifeexpectaty(String lifeexpectaty) {
		this.lifeexpectaty = lifeexpectaty;
	}
	@Column(name = "GNP")
	public String getGnp() {
		return gnp;
	}
	public void setGnp(String gnp) {
		this.gnp = gnp;
	}
	@Column(name = "GNPOId")
	public String getGnpoid() {
		return gnpoid;
	}
	public void setGnpoid(String gnpoid) {
		this.gnpoid = gnpoid;
	}
	@Column(name = "LocalName")
	public String getLocalname() {
		return localname;
	}
	public void setLocalname(String localname) {
		this.localname = localname;
	}
	@Column(name = "GovernmentForm")
	public String getGovernmentform() {
		return governmentform;
	}
	
	public void setGovernmentform(String governmentform) {
		this.governmentform = governmentform;
	}
	@Column(name = "HeadOfState")
	public String getHeadofstate() {
		return headofstate;
	}
	public void setHeadofstate(String headofstate) {
		this.headofstate = headofstate;
	}
	@Column(name = "Capital")
	public Integer getCapital() {
		return capital;
	}
	public void setCapital(Integer capital) {
		this.capital = capital;
	}
	@Column(name = "Code2")
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "country [code=" + code + ", name=" + name + ", continent=" + continent + ", region=" + region
				+ ", surfacearea=" + surfacearea + ", indepYear=" + indepYear + ", population=" + population
				+ ", lifeexpectaty=" + lifeexpectaty + ", gnp=" + gnp + ", gnpoid=" + gnpoid + ", localname="
				+ localname + ", governmentform=" + governmentform + ", headofstate=" + headofstate + ", capital="
				+ capital + ", code2=" + code2 + "]";
	}

}
