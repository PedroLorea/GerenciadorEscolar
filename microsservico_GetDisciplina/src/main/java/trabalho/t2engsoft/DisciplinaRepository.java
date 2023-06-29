package trabalho.t2engsoft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
}
