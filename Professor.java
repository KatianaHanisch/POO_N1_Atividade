public class Professor {
      String nomeSobrenome;
      String cpf;
      int idade;
      String genero;
      String graduacao;

      String InformacoesProfessor() {
            return "Nome do Professor: " + nomeSobrenome + "\nCPF do Professor: " + cpf + "\nIdade do Professor: "
                        + idade + "\nGenero do professor: " + genero + "\nGraduacao do professor: " + graduacao;
      }
}
