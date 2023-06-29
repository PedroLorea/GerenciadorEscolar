package trabalho.t2engsoft;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {

    List<Estudante> findByNome(String nome);
}
