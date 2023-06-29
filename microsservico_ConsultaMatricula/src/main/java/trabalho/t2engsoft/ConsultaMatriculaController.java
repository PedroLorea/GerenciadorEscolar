package trabalho.t2engsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value="estudante")
public class ConsultaMatriculaController {

    @Autowired
    private EstudanteRepository repository;


    @GetMapping("/consultaMatricula/{matricula}")
    public List<Estudante> consultaMatricula(@PathVariable int matricula){
        return repository.findByMatricula(matricula);
    }
}
