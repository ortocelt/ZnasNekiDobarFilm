package net.etfbl.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class Dogadjaj implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	Timestamp datumObjave;
	Timestamp datumOdrzavanja;
	String naziv;
	String lokacija;
	int korisnik;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDatumObjave() {
		return datumObjave;
	}

	public void setDatumObjave(Timestamp datumObjave) {
		this.datumObjave = datumObjave;
	}

	public Timestamp getDatumOdrzavanja() {
		return datumOdrzavanja;
	}

	public void setDatumOdrzavanja(Timestamp datumOdrzavanja) {
		this.datumOdrzavanja = datumOdrzavanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getLokacija() {
		return lokacija;
	}

	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}

	public int getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(int korisnik) {
		this.korisnik = korisnik;
	}

}
