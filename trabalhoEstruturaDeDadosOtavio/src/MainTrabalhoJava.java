import java.time.LocalDate;
import java.util.*;

public class MainTrabalhoJava {
    public static void main(String[] args) {

        // Exercício 2 - Listas dinâmicas:
        System.out.println("Exercício 2 - Listas dinâmicas");
        Aluno aluno1 = new Aluno("João", LocalDate.of(2000, 5, 15), 1001);
        Aluno aluno2 = new Aluno("Maria", LocalDate.of(2001, 8, 23), 1002);
        Aluno aluno3 = new Aluno("Pedro", LocalDate.of(1999, 12, 10), 1003);

        List<Aluno> alunosList = new ArrayList<>();

        alunosList.add(aluno1);
        alunosList.add(aluno2);
        alunosList.add(aluno3);

        for(Aluno aluno : alunosList) {
            System.out.println(aluno);
        }

        // Exercício 3 - Listas dinâmicas:
        System.out.println("Exercício 3 - Listas dinâmicas");
        alunosList.remove(0);
        alunosList.remove(1);

        for(Aluno aluno : alunosList) {
            System.out.println(aluno);
        }

       // Exercício 5 - Conjuntos (Set):
        System.out.println("Exercício 5 - Conjuntos (Set)");
        Set<Aluno> alunosSet = new HashSet<>();

        Aluno aluno4 = new Aluno("Otavio", LocalDate.of(1999, 12, 10), 1003);

        alunosSet.add(aluno1);
        alunosSet.add(aluno2);
        alunosSet.add(aluno3);
        alunosSet.add(aluno4);

        for(Aluno aluno : alunosSet){
            System.out.println(aluno);
        }

        //Exercício 6 - Conjuntos (Set):
        System.out.println("Exercício 6 - Conjuntos (Set)");

        Set<Aluno> alunoSetUnion1 = new HashSet<>();
        Set<Aluno> alunoSetUnion2 = new HashSet<>();

        alunoSetUnion1.add(aluno1);
        alunoSetUnion1.add(aluno2);

        alunoSetUnion2.add(aluno2);
        alunoSetUnion2.add(aluno3);

        alunoSetUnion1.addAll(alunoSetUnion2);

        for(Aluno aluno : alunoSetUnion1){
            System.out.println(aluno);
        }

        //Exercício 7 - Filas (LinkedList):
        System.out.println("Exercício 7 - Filas (LinkedList)");

        LinkedList<Aluno> alunoQueueEx7 = new LinkedList<>();

        alunoQueueEx7.offer(aluno1);
        alunoQueueEx7.offer(aluno2);

        Aluno alunoRemoveQueueEx7 = alunoQueueEx7.removeFirst();

        System.out.println(alunoRemoveQueueEx7.getNome());

        // Exercício 8 - Filas (LinkedList):
        System.out.println("Exercício 8 - Filas (LinkedList):");

        LinkedList<Aluno> alunoQueueEx8 = new LinkedList<>();

        alunoQueueEx8.offer(aluno1);
        alunoQueueEx8.offer(aluno2);

        Aluno alunoRemoveQueueEx8 = alunoQueueEx8.removeLast();
        System.out.println(alunoRemoveQueueEx8.getNome());

        // Exercício 9 - Pilhas (Stack)
        System.out.println("Exercício 9 - Pilhas (Stack)");

        Stack<Aluno> alunoStackEx9 = new Stack<>();

        alunoStackEx9.push(aluno1);
        alunoStackEx9.push(aluno2);

        Aluno alunoRemoveStackEx9 = alunoStackEx9.remove(0);

        System.out.println(alunoRemoveStackEx9.getNome());

        // Exercício 10 - Pilhas (Stack)
        System.out.println("Exercício 10 - Pilhas (Stack)");

        Stack<Aluno> alunoStackEx10 = new Stack<>();

        alunoStackEx10.push(aluno1);
        alunoStackEx10.push(aluno2);

        Aluno alunoStackRemoveEx10 = alunoStackEx10.pop();

        System.out.println(alunoStackRemoveEx10.getNome());
    }
}
