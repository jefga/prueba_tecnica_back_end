package dao;

/**
 * clase representa las interfaces que extiende de JpaRepository del objeto planeta
 * @version 1.0, 06/09/21
 * @author yeferson gamez canga 
 */

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import model.Planeta;

public interface PlanetasJpaSpring extends JpaRepository<Planeta, Long> {
    
	/**
	* Este método se encarga recuperar lista de Planeta Top 3  
	 * @author yeferson gamez
	 * @param  limite dato tipo int  
	 * @return lista de objeto Planeta
	*/
	@Query(nativeQuery = true,value = "SELECT * FROM Planeta ORDER BY contador DESC LIMIT :limite")
	public List<Planeta> top3(@Param("limite") int limite);

}
