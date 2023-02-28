package n2exercici1;

import java.util.Objects;

public class Restaurante {
	
	private String nom;
	private int puntuacion;
	
	public Restaurante(String nom, int puntuacion) {
		this.nom=nom;
		
		this.puntuacion=puntuacion;
		
	}
	public Restaurante(String nom) {
		this.nom=nom;
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
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Restaurante)) {
			return false;
		}
		Restaurante other = (Restaurante) obj;
		return Objects.equals(nom, other.nom) && puntuacion == other.puntuacion;
	}
	
}