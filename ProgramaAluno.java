public class ProgramaAluno {
      public static void main(String[] args) {
            Aluno aluno = new Aluno();
            aluno.nomeSobrenome = "Katiana Hanisch";
            aluno.cpf = "000.777.666-44";
            aluno.idade = 19;
            aluno.genero = "Feminino";
            aluno.codigoAluno = 6633;
            aluno.cursoAluno = "Analise e Desenvolvimento de Sistemas";

            aluno.professor.nomeSobrenome = "Rafael Santos";
            aluno.professor.idade = 33;
            aluno.professor.genero = "Masculino";
            aluno.professor.cpf = "888.888.888-88";
            aluno.professor.graduacao = "Engenharia de Software";

            aluno.curso.nomeCurso = "Analise e Desenvolvimento de Sistemas";
            aluno.curso.descricaoCurso = "Curso que qualifica e possibilita a criacao de sistemas empresarias e sites";
            aluno.curso.quantidadeAlunosCurso = 70;
            aluno.curso.unidadeUniversidade = "Florenca";
            aluno.curso.coordenadorCurso = "Arthur Medeiros";
            aluno.curso.codigoCurso = 6;

            aluno.universidade.nomeUniversidade = "Unifasipe";
            aluno.universidade.quantidadeAlunos = 1000;
            aluno.universidade.quantidadeCursos = 40;
            aluno.universidade.quantidadeDeUnidades = 4;

            aluno.materias.nomeMaterias[0] = "Metodologia Cientifica";
            aluno.materias.nomeMaterias[1] = "Sistemas Operacionais";
            aluno.materias.nomeProfessor[0] = "Adriano Francisco";
            aluno.materias.nomeProfessor[1] = "Matheus Souza";

            System.out.println("\n-------------Dados dos Alunos--------------\n");
            System.out.println("Nome do aluno: " + aluno.nomeSobrenome);
            System.out.println("CPF do aluno: " + aluno.cpf);
            System.out.println("Idade do aluno: " + aluno.idade);
            System.out.println("Genero do aluno: " + aluno.genero);
            System.out.println("Curso do aluno: " + aluno.cursoAluno);
            System.out.println("RA do aluno: " + aluno.codigoAluno);

            System.out.println("\n-------------Dados dos Professores--------------\n");
            System.out.println(aluno.professor.InformacoesProfessor());

            System.out.println("\n-------------Informacoes do Curso--------------\n");
            System.out.println(aluno.curso.InformacoesCurso());

            System.out.println("\n-------------Informacoes da Universidade--------------\n");
            System.out.println(aluno.universidade.InformacoesUniversidade());

            System.out.println("\n-------------Informacoes sobre as Materias--------------\n");
            System.out.println(aluno.materias.InformacoesMaterias());

            System.out.println("------------------------Metodos--------------------------\n");
            System.out.println("--------Metodo de  alterar curso do Aluno-------\n");
            System.out.println("Curso Inicial do aluno: " + aluno.cursoAluno);
            aluno.alterarCursoAluno("Direito");
            System.out.println("Curso final do Aluno: " + aluno.cursoAluno);

            System.out.println("\n--------Metodo de  alterar coordenador do curso-------\n");
            System.out.println("Coordenador: " + aluno.curso.coordenadorCurso);
            aluno.curso.alterarCoordenadorCurso("Sergio Ramos");
            System.out.println("Nome coordenador do curso: " + aluno.curso.coordenadorCurso);

            System.out.println("\n--------Metodo para visualizar as incricoes para o vestibular-------\n");
            aluno.universidade.estadoDasMatriculas(true);

            System.out.println("\n---------------------------------------------------");

      }
}