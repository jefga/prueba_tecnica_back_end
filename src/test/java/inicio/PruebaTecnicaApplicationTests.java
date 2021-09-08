package inicio;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest
class PruebaTecnicaApplicationTests {

	@Autowired
	MockMvc mock;
	
	@Test
	@Order(0)
	void testPlanetas() throws Exception{ 
		mock.perform(get("/planetas")).andDo(print());
	}
	@Test
	@Order(1)
	void testPlanetaId() throws Exception{ 
		mock.perform(get("/planetas/2")).andDo(print());
	}
	
	@Test
	@Order(2)
	void testPlanetasTop3() throws Exception{ 
		mock.perform(get("/planetasTop3/3")).andDo(print());
	}
	@Test
	@Order(3)
	void testPersonas() throws Exception{ 
		mock.perform(get("/personas")).andDo(print());
	}
	
	@Test
	@Order(4)
	void testPersonaId() throws Exception{ 
		mock.perform(get("/personas/2")).andDo(print());
	}
	
	@Test
	@Order(5)
	void testPersonaTop3() throws Exception{ 
		mock.perform(get("/personasTop3/3")).andDo(print());
	}
	@Test
	@Order(6)
	void testListaPersona() throws Exception{ 
		mock.perform(get("/listaPersonas")).andDo(print());
	}

}
