package n2exercici2;

import java.util.Objects;

public class Restaurante implements Comparable<Restaurante> {
	
	private String nom;
	private int puntuacion;
	
	public Restaurante(String nom, int puntuacion) {
		this.nom=nom;
		
		this.puntuacion=puntuacion;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "Restaurante: " + nom + ", Puntuacion:" + puntuacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nom, puntuacion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		return Objects.equals(nom, other.nom) && puntuacion == other.puntuacion;
	}
	/*
	Cero	Dos cadenas son iguales.
	Mayor que cero	La cadena de invocación es mayor que str.
	Menos que cero	La cadena de invocación es menor que str.*/
	@Override
	public int compareTo(Restaurante o) {
		if (this.nom.compareTo(o.getNom()) == 0) {
			if (this.puntuacion < o.getPuntuacion()) {
				return 1;
			} else if (o.getPuntuacion() < this.puntuacion) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return this.nom.compareTo(o.getNom());
		}
	}
}