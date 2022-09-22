import br.edu.ifpi.dominio.*;

import java.time.LocalDate;

public class App {
        public static void main(String[] args) throws Exception {
                Aluno a1 = new Aluno("João", LocalDate.now(), "joao123@gmail.com");
                Professor p1 = new Professor("José", "jose123@gmail.com", "Mestre");
                Curso c = new Curso("ADS", 2000, "Hibrido", "Superior", LocalDate.now(), LocalDate.now(), p1);
                Certificado cc = new Certificado("João", "ADS", "Superior", 2000, p1);

                System.out.println("Nome do Aluno: " + a1.getNomeAluno());
                System.out.println("Nome do Professor: " + p1.getNomeProfessor());
                System.out.println("Nome do Curso: " + c.getNome());
                System.out.println("Certificado: " + cc.getNomeA());
        }

}