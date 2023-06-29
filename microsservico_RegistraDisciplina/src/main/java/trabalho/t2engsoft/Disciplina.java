package trabalho.t2engsoft;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Disciplina {

    @Id
    String codigoDisciplina;
    String descricao;
    String horario;
    int codigoTurma;

//    @JsonIgnore
//    HashMap<Estudante, Integer> estudantesMatriculados = new HashMap<>(); //Hashmap com Estudante e a Turma

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

    public String getHorario(){
        return horario;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }


//    public List<Estudante> getEstudantesMatriculadosLista() {
//        List<Estudante> estudantesMatriculadosLista = new ArrayList<>();
//
//        for (Map.Entry<Estudante, Integer> entry : estudantesMatriculados.entrySet()) {
//            Estudante estudante = entry.getKey();
//            estudantesMatriculadosLista.add(estudante);
//        }
//        return estudantesMatriculadosLista;
//    }

//    public Map<Estudante, Integer> getEstudantesMatriculados(){
//        return estudantesMatriculados;
//    }


//    public void matriculaEstudante(Estudante estudante, int codigoTurma){
//        estudantesMatriculados.put(estudante, codigoTurma);
//    }
//
//    public Estudante getEstudanteMatricula(int matricula){
//        for (Map.Entry<Estudante, Integer> entry : estudantesMatriculados.entrySet()) {
//            Estudante estudante = entry.getKey();
//            if(estudante.getMatricula() == matricula) return estudante;
//        }
//        return null;
//    }

}
