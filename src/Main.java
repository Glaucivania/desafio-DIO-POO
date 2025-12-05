import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descricao curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVania = new Dev();
        devVania.setNome("Vania");
        devVania.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Vania:" + devVania.getConteudosInscritos());
        devVania.progredir();
        devVania.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Vania:" + devVania.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Vania:" + devVania.getConteudosConcluidos());
        System.out.println("XP:" + devVania.calcularTotalXP());


        System.out.println("-------");


        Dev devGlaucivania = new Dev();
        devGlaucivania.setNome("Glaucivania");
        devGlaucivania.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Glaucivania:" + devGlaucivania.getConteudosInscritos());
        devGlaucivania.progredir();
        devGlaucivania.progredir();
        devGlaucivania.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Glaucivania:" + devGlaucivania.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Glaucivania:" + devGlaucivania.getConteudosConcluidos());
        System.out.println("XP:" + devGlaucivania.calcularTotalXP());

    }
}
