package trabalho.t2engsoft;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;

//@SpringBootTest
//@AutoConfigureMockMvc
class RegistraDisciplinaApplicationTests {

//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private RestTemplate restTemplate;
//
//	private ObjectMapper objectMapper = new ObjectMapper();
//
//	@Test
//	void registraDisciplinaTest() throws Exception {
//
//		Disciplina disciplina = new Disciplina();
//		disciplina.setCodigoDisciplina("321");
//		disciplina.setDescricao("Discp");
//		disciplina.setHorario("10:00");
//		disciplina.setCodigoTurma(1);
//
//		doAnswer(invocation -> null).when(restTemplate).postForObject(any(), any(), any());
//
//		mockMvc.perform(MockMvcRequestBuilders.post("/disciplina/registra")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(objectMapper.writeValueAsString(disciplina)))
//				.andExpect(MockMvcResultMatchers.status().isOk());
//	}
}




