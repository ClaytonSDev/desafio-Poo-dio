import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.function.DoubleToIntFunction;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição Curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Descrição Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp JAva Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devClayton = new Dev();
        devClayton.setNome("Clayton");
        devClayton.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Clayton" + devClayton.getConteudosInscritos());
        devClayton.progredir();
        devClayton.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Clayton" + devClayton.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Clayton" + devClayton.getConteudosConcluidos());
        System.out.println("XP:" + devClayton.calcularTotalXp());

        System.out.println("--------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devClayton.calcularTotalXp());

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Ana" + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ana" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devClayton.calcularTotalXp());


    }
}