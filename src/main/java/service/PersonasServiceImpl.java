package service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.PersonasDao;
import dao.PlanetasDao;
import dto.PersonaDetail;
import model.Persona;
import model.Planeta;

@Service
public class PersonasServiceImpl implements PersonasService {
    
	@Autowired
	PersonasDao dao;
	@Autowired
	PlanetasDao daoPlaneta;

	
	@Override
	public List<PersonaDetail> DevolverPersonas() {
		// TODO Auto-generated method stub
		return dao.findByALL();
	}

	@Override
	public void contadorPersona(long id) {
		// TODO Auto-generated method stub
		Persona existente=dao.recuperarPersonas(id);
		
		if(!Objects.isNull(existente)){
			
			existente.setContador(existente.getContador()+1);
			dao.actualizarPersonas(existente);
			
			Planeta existentePlaneta=daoPlaneta.recuperarPlaneta(existente.getIdplaneta());
			if(!Objects.isNull(existentePlaneta)){
				existentePlaneta.setContador(existentePlaneta.getContador()+1);
				daoPlaneta.actualizarPlanetas(existentePlaneta);
			}
		}
	}

	@Override
	public List<Persona> top3(int limite) {
		// TODO Auto-generated method stub
		return dao.top3(limite);
	}

	@Override
	public List<PersonaDetail> findByALL() {
		// TODO Auto-generated method stub
		return dao.findByALL();
	}

	@Override
	public PersonaDetail findByIdpersona(long idpersona) {
		contadorPersona(idpersona);
		return dao.findByIdpersona(idpersona);
	}

}
