package service;

import java.util.List;

import dto.PersonaDetail;
import model.Persona;

public interface PersonasService{
	
	List<PersonaDetail> DevolverPersonas();

	void contadorPersona(long id);
	public List<Persona> top3(int limite);

	
	public List<PersonaDetail> findByALL();
	public PersonaDetail findByIdpersona(long idpersona);
}
