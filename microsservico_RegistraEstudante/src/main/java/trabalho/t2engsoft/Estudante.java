package trabalho.t2engsoft;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;

@Entity
public class Estudante{

    String nome;
    String endereco;
    @Id
    int documento;
    int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento){
        this.documento = documento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}
