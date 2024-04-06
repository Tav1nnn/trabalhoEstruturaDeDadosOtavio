import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TrabalhoJava {
    public static void main(String[] args) {

        // Exercício 2 - Listas dinâmicas:
        System.out.println("Exercício 2 - Listas dinâmicas");
        Aluno aluno1 = new Aluno("João", LocalDate.of(2000, 5, 15), 1001);
        Aluno aluno2 = new Aluno("Maria", LocalDate.of(2001, 8, 23), 1002);
        Aluno aluno3 = new Aluno("Pedro", LocalDate.of(1999, 12, 10), 1003);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        // Exercício 3 - Listas dinâmicas:
        System.out.println("Exercício 3 - Listas dinâmicas");
        alunos.remove(0);
        alunos.remove(1);

        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
