public class Materias {
      String[] nomeMaterias = new String[2];
      String[] nomeProfessor = new String[2];

      String InformacoesMaterias() {
            for (int i = 0; i < 2; i++) {
                  System.out.println(
                              "Materia: " + nomeMaterias[i] + "\nProfessor da materia: " + nomeProfessor[i] + "\n");
            }
            ;
            return " ";
      }

}
