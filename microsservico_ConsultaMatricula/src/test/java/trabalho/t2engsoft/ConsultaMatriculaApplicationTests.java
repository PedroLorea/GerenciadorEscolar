package trabalho.t2engsoft;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

//@WebMvcTest(GetEstudanteController.class)
public class ConsultaMatriculaApplicationTests {

//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private RestTemplate restTemplate;
//
//	@Test
//	public void testGetEstudantes() throws Exception {
//
//		List<Estudante> estudantes = new ArrayList<>();
//		Estudante estudante1 = new Estudante();
//		estudante1.setNome("Pedro");
//		estudante1.setEndereco("Poa");
//		estudante1.setDocumento(123);
//		estudante1.setMatricula(1);
//		estudantes.add(estudante1);
//
//		Mockito.when(restTemplate.exchange(
//				Mockito.anyString(),
//				Mockito.eq(HttpMethod.GET),
//				Mockito.any(),
//				Mockito.<ParameterizedTypeReference<List<Estudante>>>any()
//		)).thenReturn(ResponseEntity.ok(estudantes));
//
//		mockMvc.perform(MockMvcRequestBuilders.get("/estudante/get")
//						.contentType(MediaType.APPLICATION_JSON))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$[0].nome").value("Pedro"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$[0].endereco").value("Poa"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$[0].documento").value(123))
//				.andExpect(MockMvcResultMatchers.jsonPath("$[0].matricula").value(1));
//	}
}

