import com.github.juliavasconceloscr161.desafio.Bootcamp;
import com.github.juliavasconceloscr161.desafio.Curso;
import com.github.juliavasconceloscr161.desafio.Dev;
import com.github.juliavasconceloscr161.desafio.Mentoria;


import java.sql.Date;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java POO");
        curso.setDescricao("Curso sobre programação orientada a objetos com linguagem java.");
        curso.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(8);


        Mentoria mentoria = new Mentoria("Mentoria java", "Descrição Mentoria", LocalDate.now());

//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.concluirUmConteudo();
        System.out.println("\nApós " + devJoao.getNome() + " concluir um conteúdo:");
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP " + devJoao.getNome() + " : " + devJoao.calcularTotalXp());


        Dev devVanessa = new Dev();
        devVanessa.setNome("Vanessa");
        devVanessa.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Vanessa: " + devVanessa.getConteudosInscritos());
        devVanessa.concluirUmConteudo();
        devVanessa.concluirUmConteudo();
        devVanessa.concluirUmConteudo();
        System.out.println("\nApós " + devVanessa.getNome() +  " concluir conteúdos:");
        System.out.println("Conteúdos Inscritos Vanessa: " + devVanessa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vanessa: " + devVanessa.getConteudosConcluidos());
        System.out.println("XP " + devVanessa.getNome() + " : " + devVanessa.calcularTotalXp());


    }
}
