package model;

/**
 * clase que representar modelo entidad jpa de tabla persona 
 * @version 1.0, 06/09/21
 * @author yeferson gamez canga 
 */

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="persona")
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idpersona;
	
	private String nombre;
	private int edad;
	private double altura;
	private double peso;
	private int contador;
    private long idplaneta;
    
    // metodos Getters y Setters
    
	public long getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public long getIdplaneta() {
		return idplaneta;
	}
	public void setIdplaneta(long idplaneta) {
		this.idplaneta = idplaneta;
	}
	
}
