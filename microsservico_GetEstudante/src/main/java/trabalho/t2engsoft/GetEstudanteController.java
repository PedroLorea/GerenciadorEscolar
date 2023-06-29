package trabalho.t2engsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value="estudante")
public class GetEstudanteController {

    @Autowired
    private EstudanteRepository repository;


    @GetMapping("/get")
    public List<Estudante> getEstudante(){
        return repository.findAll();
    }
}
