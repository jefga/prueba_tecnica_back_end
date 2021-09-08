package dao;

/**
 * clase implementa los métodos de las interfaces  de la clase Dao persona
 * @version 1.0, 06/09/21
 * @author yeferson gamez canga 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.PersonaDetail;
import model.Persona;

@Repository
public class PersonasDaoImpl implements PersonasDao {

	@Autowired
	PersonasJpaSpring personas;

	/**
	 * Este método se encarga recuperar una persona por su identificador 
	 * @author yeferson gamez
	 * @param id dato de tipo entero 
	 * @return objeto de tipo persona
	*/
	@Override
	public Persona recuperarPersonas(long id) {
	
		return personas.findById(id).orElse(null);
	}

	/**
	 * Este método se encarga recuperar una lista de persona 
	 * @author yeferson gamez
	 * @param No aplica 
	 * @return lista objeto de tipo persona
	*/
	@Override
	public List<Persona> devolverPersonas() {
	
		return personas.findAll();
	}

	/**
	 * Este método se encarga actualizar propiedades de una persona 
	 * @author yeferson gamez
	 * @param  persona es un dato tipo persona  
	 * @return No aplica
	*/
	@Override
	public void actualizarPersonas(Persona persona) {
		
		personas.save(persona);
	}
	
	/**
	 * Este método se encarga recuperar lista de persona top  
	 * @author yeferson gamez
	 * @param  limite dato tipo entero  
	 * @return lista de objeto persona
	*/
	@Override
	public List<Persona> top3(int limite) {
	
		return personas.top3(limite);
	}
    
	/**
	 * Este método se encarga recuperar lista de PersonaDetail  
	 * @author yeferson gamez
	 * @param  No aplica 
	 * @return lista de objeto PersonaDetail 
	*/
	@Override
	public List<PersonaDetail> findByALL() {
		return personas.findByALL();
	}
    
	/**
	 * Este método se encarga recuperar lista de PersonaDetail  
	 * @author yeferson gamez
	 * @param  idplaneta dato tipo long  
	 * @return lista de objeto PersonaDetail
	*/
	@Override
	public PersonaDetail findByIdpersona(long idplaneta) {
		return personas.findByIdpersona(idplaneta);
	}
	
	

}
