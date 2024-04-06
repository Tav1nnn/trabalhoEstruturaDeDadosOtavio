import java.time.LocalDate;
import java.util.Objects;

// Exercício 1 - Classes Java:
public class Aluno {

    private String nome;
    private LocalDate dataNascimento;
    private Integer matricula;

    public Aluno(String nome, LocalDate dataNascimento, Integer matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", matricula=" + matricula +
                '}';
    }

}
