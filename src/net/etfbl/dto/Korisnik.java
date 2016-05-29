package net.etfbl.dto;

import java.io.Serializable;

public class Korisnik implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int id;
	String ime;
	String prezime;
	String username;
	String password;
	String email;
	int tipKorisnika;
	String jmbg;
	String slika;
	int aktivan;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTipKorisnika() {
		return tipKorisnika;
	}

	public void setTipKorisnika(int tipKorisnika) {
		this.tipKorisnika = tipKorisnika;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getSlika() {
		return slika;
	}

	public void setSlika(String slika) {
		this.slika = slika;
	}

	public int getAktivan() {
		return aktivan;
	}

	public void setAktivan(int aktivan) {
		this.aktivan = aktivan;
	}

}
