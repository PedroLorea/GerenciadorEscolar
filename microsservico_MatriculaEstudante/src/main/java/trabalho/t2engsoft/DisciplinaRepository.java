package trabalho.t2engsoft;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;


public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {


    @Transactional
    @Modifying
    default void matriculaEstudante(int codigoDisciplina, int numeroDocumento) {
        Disciplina disciplina = findById(codigoDisciplina).orElse(null);
        if (disciplina != null) {
            disciplina.getEstudantesMatriculados().add(numeroDocumento);
            save(disciplina);
        }
    }

}
