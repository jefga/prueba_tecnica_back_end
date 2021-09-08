package service;
import java.util.List;

import model.Planeta;
public interface PlanetasService {
	
	
	List<Planeta> DevolverPlanetas();
	Planeta buscarPlanetaContador(long id);
	
	void contadorPlaneta(long id);
	
	public List<Planeta> top3(int limite);

}
