package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dto.PersonaDetail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import model.Persona;
import model.Planeta;
import service.PersonasService;
import service.PlanetasService;


@Api(value="Consultas de los habitante los planetas")
@CrossOrigin(origins = "*") //permite recibir peticiones desde cualquier origen
@RestController
public class ServiciosController {
	
	@Autowired
	PlanetasService servicePlaneta;
	@Autowired
	PersonasService servicePersona;
	
	@ApiOperation(value="Devuelve la lista de planetas",response=List.class)
	@GetMapping(value="planetas",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Planeta> devolverPlanetas() {
		return servicePlaneta.DevolverPlanetas();
	}
	
	@ApiOperation(value="Retorna un planeta por su identificador",response=Planeta.class)
	@GetMapping(value="planetas/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Planeta recuperarPlanetas(@PathVariable("id") int id) {
		return servicePlaneta.buscarPlanetaContador(id);
	}
	
	@ApiOperation(value="Retorna la lista de personas",response=List.class)
	@GetMapping(value="personas",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PersonaDetail> devolverPersonas() {
		return servicePersona.DevolverPersonas();
	}
	
	@ApiOperation(value="Retorna una persona por su identificador",response=PersonaDetail.class)
	@GetMapping(value="personas/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public PersonaDetail recuperarPersonas(@PathVariable("id") int id) {
		return servicePersona.findByIdpersona(id);
	}
	
	@ApiOperation(value="Retorna la lista de personas del top3",response=List.class)
	@GetMapping(value="personasTop3/{limite}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Persona> personasTop3(@PathVariable("limite") int limite) {
		
		return servicePersona.top3(limite);
	}
	
	@ApiOperation(value="Retorna la lista de planetas del top3",response=List.class)
	@GetMapping(value="planetasTop3/{limite}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Planeta> planetasTop3(@PathVariable("limite") int limite) {
		
		return servicePlaneta.top3(limite);
	}
	
	@ApiOperation(value="Retorna la lista de personas",response=List.class)
	@GetMapping(value="listaPersonas",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PersonaDetail> listaPersonas() {
		
		return servicePersona.findByALL();
	}
	
	


}
