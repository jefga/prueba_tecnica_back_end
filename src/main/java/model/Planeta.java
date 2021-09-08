package model;

/**
 * clase que representar modelo entidad jpa de tabla planeta 
 * @version 1.0, 06/09/21
 * @author yeferson gamez canga 
 */

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="planeta")
public class Planeta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idplaneta;
	private String nombre;
	private String descripcion;
	private double diametro;
	private String clima;
	private String rotacion;
	private String terreno;
	private int contador;
	
	@OneToMany
	@JoinColumn(name="idplaneta")
	private Set<Persona> personas;
	
	// metodos Getters y Setters
	
	public long getIdplaneta() {
		return idplaneta;
	}
	public void setIdplaneta(long idplaneta) {
		this.idplaneta = idplaneta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public String getRotacion() {
		return rotacion;
	}
	public void setRotacion(String rotacion) {
		this.rotacion = rotacion;
	}
	public String getTerreno() {
		return terreno;
	}
	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public Set<Persona> getPersonas() {
		return personas;
	}



	

	
	
	

	
	
	
	
	
}