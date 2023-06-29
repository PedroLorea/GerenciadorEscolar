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
public class ConsultaNomeController {

    @Autowired
    private EstudanteRepository repository;


    @GetMapping("/consultaNome/{nome}")
    public Estudante consultaMatricula(@PathVariable String nome){
        return repository.findByNome(nome);
    }
}
