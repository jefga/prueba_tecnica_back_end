package service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PersonasDao;
import dao.PlanetasDao;
import model.Planeta;


@Service
public class PlanetasServiceImpl implements PlanetasService  {

	@Autowired
	PlanetasDao dao;
	@Autowired
	PersonasDao daoPersona;
	
	
	@Override
	public List<Planeta> DevolverPlanetas() {
		
			return dao.devolverPlanetas();
	}

	@Override
	public Planeta buscarPlanetaContador(long id) {
	
		contadorPlaneta(id);
		return dao.recuperarPlaneta(id);
	}

	@Override
	public void contadorPlaneta(long id) {
	
		Planeta existente=dao.recuperarPlaneta(id);
		if(!Objects.isNull(existente)){
			existente.setContador(existente.getContador()+1);
			dao.actualizarPlanetas(existente);
		}
	}

	@Override
	public List<Planeta> top3(int limite) {
		
		return dao.top3(limite);
	}
	
	



	
	



}
