public class Aluno {
      String nomeSobrenome;
      String cpf;
      int idade;
      String genero;
      String cursoAluno;
      int codigoAluno;

      Curso curso = new Curso();
      Professor professor = new Professor();
      Universidade universidade = new Universidade();
      Materias materias = new Materias();

      void alterarCursoAluno(String cursoAluno) {
            this.cursoAluno = cursoAluno;
      }
}