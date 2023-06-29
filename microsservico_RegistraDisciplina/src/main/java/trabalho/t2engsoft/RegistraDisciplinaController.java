package trabalho.t2engsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="disciplina")
public class RegistraDisciplinaController {


    @Autowired
    private DisciplinaRepository repository;


    @PostMapping("/registra")
    public void registraDisciplina(@RequestBody Disciplina disciplina) {
        repository.save(disciplina);
    }
}
