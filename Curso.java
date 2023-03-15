public class Curso {
      String nomeCurso;
      String descricaoCurso;
      String coordenadorCurso;
      String unidadeUniversidade;
      int quantidadeAlunosCurso;
      int codigoCurso;

      String InformacoesCurso() {
            return "Nome do curso: " + nomeCurso + "\nDescricao do Curso: " + descricaoCurso
                        + "\nCoordenador do Curso: " + coordenadorCurso + "\nUnidade da Universidade: "
                        + unidadeUniversidade
                        + "\nQuantidade de Alunos no Curso: " + quantidadeAlunosCurso + "\nCodigo do Curso: "
                        + codigoCurso;
      }

      void alterarCoordenadorCurso(String coordenadorCurso) {
            this.coordenadorCurso = coordenadorCurso;
      }
}
