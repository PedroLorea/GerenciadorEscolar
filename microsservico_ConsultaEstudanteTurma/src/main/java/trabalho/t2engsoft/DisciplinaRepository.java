package trabalho.t2engsoft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {

    @Query("SELECT d.estudantesMatriculados FROM Disciplina d WHERE d.codigoTurma = :codigoTurma")
    List<?> getEstudantesMatriculadosTurma(@Param("codigoTurma") int codigoTurma);
}
