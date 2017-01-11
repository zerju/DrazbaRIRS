package classesDAO;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drazba {
	/*
	  drazba(datum_do,datum_od, ime, predmet, user*,opis, zaèetna cena,kategorija,slika(url))
	  */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int drazbaId;
	private Date datum_od;
	private Date datum_do;
	private String imeDrazbe;
	private String predmet;
	private Uporabnik uporabnik;
	private String opis;
	private double zacetnaCena;
	private String kategorija;
	private String slika;
	
	
	
	public int getDrazbaId() {
		return drazbaId;
	}
	public void setDrazbaId(int drazbaId) {
		this.drazbaId = drazbaId;
	}
	public Date getDatum_od() {
		return datum_od;
	}
	public void setDatum_od(Date datum_od) {
		this.datum_od = datum_od;
	}
	public Date getDatum_do() {
		return datum_do;
	}
	public void setDatum_do(Date datum_do) {
		this.datum_do = datum_do;
	}
	public String getImeDrazbe() {
		return imeDrazbe;
	}
	public void setImeDrazbe(String imeDrazbe) {
		this.imeDrazbe = imeDrazbe;
	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public Uporabnik getUporabnik() {
		return uporabnik;
	}
	public void setUporabnik(Uporabnik uporabnik) {
		this.uporabnik = uporabnik;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public double getZacetnaCena() {
		return zacetnaCena;
	}
	public void setZacetnaCena(double zacetnaCena) {
		this.zacetnaCena = zacetnaCena;
	}
	public String getKategorija() {
		return kategorija;
	}
	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}
	public String getSlika() {
		return slika;
	}
	public void setSlika(String slika) {
		this.slika = slika;
	}
	
	
}
