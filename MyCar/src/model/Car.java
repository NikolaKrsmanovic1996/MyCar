package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCar;
	private String Marka;
	private String Model;
	private double Cena;
	private String Boja;
	private int GodinaProizvodnje;
	private int Stanje;
	
	public long getIdCar() {
		return idCar;
	}
	public void setIdCar(long idCar) {
		this.idCar = idCar;
	}
	public String getMarka() {
		return Marka;
	}
	public void setMarka(String marka) {
		Marka = marka;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getCena() {
		return Cena;
	}
	public void setCena(double cena) {
		Cena = cena;
	}
	public String getBoja() {
		return Boja;
	}
	public void setBoja(String boja) {
		Boja = boja;
	}
	public int getGodinaProizvodnje() {
		return GodinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		GodinaProizvodnje = godinaProizvodnje;
	}
	public int getStanje() {
		return Stanje;
	}
	public void setStanje(int stanje) {
		Stanje = stanje;
	}

	
	
	
	

}
