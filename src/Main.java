import com.github.juliavasconceloscr161.desafio.Curso;
import com.github.juliavasconceloscr161.desafio.Mentoria;


import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java POO");
        curso.setDescricao("Curso sobre programação orientada a objetos com linguagem java.");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria("Mentoria java", "Descrição Mentoria", LocalDate.now());
        System.out.println(mentoria);
    }
}
