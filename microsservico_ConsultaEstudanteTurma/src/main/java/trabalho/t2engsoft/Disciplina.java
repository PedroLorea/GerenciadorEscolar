package trabalho.t2engsoft;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Disciplina {
    @Id
    String codigoDisciplina;
    String descricao;
    String horario;
    int codigoTurma;

    ArrayList<Integer> estudantesMatriculados = new ArrayList<>(); // ArrayList com números de matrícula

    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public List<Integer> getEstudantesMatriculados() {
        return estudantesMatriculados;
    }

    public void matriculaEstudante(int numeroMatricula) {
        estudantesMatriculados.add(numeroMatricula);
    }

    public boolean isEstudanteMatriculado(int numeroMatricula) {
        return estudantesMatriculados.contains(numeroMatricula);
    }
}
