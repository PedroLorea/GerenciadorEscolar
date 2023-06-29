package trabalho.t2engsoft;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
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

//@WebMvcTest(GetDisciplinaController.class)
public class GetDisciplinaApplicationTests {

//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private RestTemplate restTemplate;
//
//	@Test
//	public void testGetDisciplinas() throws Exception {
//
//		List<Disciplina> disciplinas = new ArrayList<>();
//		Disciplina disciplina1 = new Disciplina();
//		disciplina1.setCodigoDisciplina("123");
//		disciplina1.setDescricao("Programação");
//		disciplina1.setHorario("10:00");
//		disciplina1.setCodigoTurma(1);
//		disciplinas.add(disciplina1);
//
//		Mockito.when(restTemplate.exchange(
//				Mockito.anyString(),
//				Mockito.eq(HttpMethod.GET),
//				Mockito.any(),
//				Mockito.<ParameterizedTypeReference<List<Disciplina>>>any()
//		)).thenReturn(ResponseEntity.ok(disciplinas));
//
//		mockMvc.perform(MockMvcRequestBuilders.get("/disciplina/get")
//						.contentType(MediaType.APPLICATION_JSON))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.jsonPath("$[0].codigoDisciplina").value("123"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$[0].descricao").value("Programação"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$[0].horario").value("10:00"))
//				.andExpect(MockMvcResultMatchers.jsonPath("$[0].codigoTurma").value(1));
//	}
}

