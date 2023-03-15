public class Universidade {
      String nomeUniversidade;
      int quantidadeDeUnidades;
      int quantidadeAlunos;
      int quantidadeCursos;
      boolean incricoesVestibular;

      String InformacoesUniversidade() {
            return "Nome da Universidade: " + nomeUniversidade + " \nQuantidade de unidades da universidade: "
                        + quantidadeDeUnidades + "\nQuantidade de alunos na universidade: " + quantidadeAlunos
                        + "\nQuantidade de cursos na universidade: " + quantidadeCursos;

      }

      void estadoDasMatriculas(boolean incricoesVestibular) {
            if (incricoesVestibular) {
                  System.out.println("As incricoes para o vestibular estao abertas!!");
            } else {
                  System.out.println("As incricoes para o vestibular ja estao encerradas");
            }
      }
}
