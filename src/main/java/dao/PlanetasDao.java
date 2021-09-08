package dao;

/**
 * clase Interfaces que representa una  abstracción sobre el modelo de datos
 * del objeto planeta 
 * @version 1.0, 06/09/21
 * @author yeferson gamez canga 
 */

import java.util.List;
import model.Planeta;

public interface PlanetasDao {
	
	Planeta recuperarPlaneta(long id);
	
	List<Planeta> devolverPlanetas();
	
	void actualizarPlanetas(Planeta planetas);
	
	List<Planeta> top3(int limite);
} 
