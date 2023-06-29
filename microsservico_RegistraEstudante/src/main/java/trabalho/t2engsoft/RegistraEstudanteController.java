package trabalho.t2engsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="estudante")
public class RegistraEstudanteController {

    @Autowired
    private EstudanteRepository repository;


    @PostMapping("/registra")
    public void registraEstudante(@RequestBody Estudante estudante) {
        repository.save(estudante);
    }

}
