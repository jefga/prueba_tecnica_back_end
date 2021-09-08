package dto;
/**
 * clase que representar objeto plano (POJO)  del objeto persona 
 * @version 1.0, 06/09/21
 * @author yeferson gamez canga 
 */

public class PersonaDetail {
	
	
	private long idpersona;
	private String nombre;
	private int edad;
	private double altura;
	private double peso;
	private int contador;
	private String nombrePlaneta;
	
	// metodos constructor
	
	public PersonaDetail(long idpersona,String nombre,int edad,double altura,double peso,int contador,String nombrePlaneta){
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.contador = contador;
		this.nombrePlaneta = nombrePlaneta;
	}
	
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

	public String getNombrePlaneta() {
		return nombrePlaneta;
	}
	public void setNombrePlaneta(String nombrePlaneta) {
		this.nombrePlaneta = nombrePlaneta;
	}
	
	

}
