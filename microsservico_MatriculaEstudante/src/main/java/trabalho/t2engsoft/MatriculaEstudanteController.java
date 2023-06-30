package trabalho.t2engsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value="disciplina")
public class MatriculaEstudanteController {

        @Autowired
        private DisciplinaRepository repository;

        @PostMapping("/matriculaestudante")
        public void matriculaEstudante(@RequestParam int documento, @RequestParam int codigoDisciplina) {
                repository.matriculaEstudante(codigoDisciplina, documento);
        }
}



