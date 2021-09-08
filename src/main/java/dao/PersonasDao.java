package dao;
/**
 * clase Interfaces que representa una  abstracción sobre el modelo de datos
 * del objeto persona 
 * @version 1.0, 06/09/21
 * @author yeferson gamez canga 
 */

import java.util.List;

import dto.PersonaDetail;
import model.Persona;

public interface PersonasDao {
	
	Persona recuperarPersonas(long id);
	
	List<Persona> devolverPersonas();
	
	void actualizarPersonas(Persona persona);
	
	List<Persona> top3(int limite);
	
	List<PersonaDetail> findByALL();
	PersonaDetail findByIdpersona(long idplaneta);
}
