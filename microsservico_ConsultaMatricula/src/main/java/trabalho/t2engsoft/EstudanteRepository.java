package trabalho.t2engsoft;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {

    Estudante findByMatricula(int matricula);
}
