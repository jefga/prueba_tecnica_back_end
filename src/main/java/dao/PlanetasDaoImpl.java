package dao;

/**
 * clase implementa los métodos de las interfaces  de la clase Dao planetas
 * @version 1.0, 06/09/21
 * @author yeferson gamez canga 
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Planeta;

@Repository
public class PlanetasDaoImpl implements PlanetasDao {

	@Autowired
	PlanetasJpaSpring planetas;
    
	/**
	 * Este método se encarga recuperar una planeta por su identificador 
	 * @author yeferson gamez
	 * @param id dato de tipo entero 
	 * @return objeto de tipo Planeta
	*/
	@Override
	public Planeta recuperarPlaneta(long id) {	
		return planetas.findById(id).orElse(null);
	}
    
	/**
	 * Este método se encarga recuperar una lista de planeta 
	 * @author yeferson gamez
	 * @param No aplica 
	 * @return lista objeto de tipo planeta
	*/
	@Override
	public List<Planeta> devolverPlanetas() {
		// TODO Auto-generated method stub
		return planetas.findAll();
	}
    
	/**
	* Este método se encarga actualizar propiedades de una planeta 
	 * @author yeferson gamez
	 * @param  planeta es un dato tipo Planeta  
	 * @return No aplica
	*/
	@Override
	public void actualizarPlanetas(Planeta planeta) {
		planetas.save(planeta);
		
	}
    
	/**
	 * Este método se encarga recuperar lista de planeta top  
	 * @author yeferson gamez
	 * @param  limite dato tipo entero  
	 * @return lista de objeto planeta
	*/
	@Override
	public List<Planeta> top3(int limite) {
		// TODO Auto-generated method stub
		return planetas.top3(limite);
	}
}
