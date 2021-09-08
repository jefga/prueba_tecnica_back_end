package dao;

/**
 * clase representa las interfaces que extiende de JpaRepository del objeto persona
 * @version 1.0, 06/09/21
 * @author yeferson gamez canga 
 */

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import dto.PersonaDetail;
import model.Persona;


public interface PersonasJpaSpring extends JpaRepository<Persona, Long>{
	
	
	/**
	* Este método se encarga recuperar lista de Persona Top 3  
	 * @author yeferson gamez
	 * @param  limite dato tipo int  
	 * @return lista de objeto Persona
	*/
	@Query(nativeQuery = true,value = "SELECT * FROM Persona ORDER BY contador DESC LIMIT :limite")
	public List<Persona> top3(@Param("limite") int limite);
	
	/**
	* Este método se encarga recuperar lista de PersonaDetail  
	 * @author yeferson gamez
	 * @param  No aplica  
	 * @return lista de objeto PersonaDetail
	*/
	@Query(value = "Select new dto.PersonaDetail(p.idpersona,p.nombre,p.edad,p.altura, p.peso ,p.contador,pl.nombre) from Persona p join Planeta pl on p.idplaneta=pl.idplaneta")
	public List<PersonaDetail> findByALL();
	
	/**
	* Este método se encarga recuperar objeto PersonaDetail  
	 * @author yeferson gamez
	 * @param  idpersona dato tipo long 
	 * @return objeto PersonaDetail
	*/
	@Query(value = "Select new dto.PersonaDetail(p.idpersona,p.nombre,p.edad,p.altura, p.peso ,p.contador,pl.nombre) from Persona p join Planeta pl on p.idplaneta=pl.idplaneta where p.idpersona=:idpersona")
	public PersonaDetail findByIdpersona(@Param("idpersona") long idpersona);
	
}
