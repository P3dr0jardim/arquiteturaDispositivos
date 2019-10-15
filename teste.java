public class problema {
    public static void main(String[] args) {
        final int[] alunos = {200, 202, 201};
        final String[] courseAcronyms = {"AD", "IHC", "WEB-BE", "ACR"};
        final int[][] studentsGrades = {
                {16, 18, 14, 15},
                {15, 19, 12, 11},
                {11, 11, 11, 11}
        };
        double[] media = new double[3];
        double highMedia=0;
        int aluno = 0;
        for (int i = 0; i < studentsGrades.length; i++) {
            System.out.println("Student number: " + alunos[i]);
            for (int j = 0; j < courseAcronyms.length; j++) {
                media[i] += studentsGrades[i][j];
                System.out.println("Had " + studentsGrades[i][j] + " at " + courseAcronyms[j]);
            }
            if (highMedia < media[i]/courseAcronyms.length) {
                highMedia = media[i]/courseAcronyms.length;
                aluno = alunos[i];
            }
            System.out.println("Media: "+media[i] / courseAcronyms.length);
        }
        System.out.println("A media mais alta é: " + highMedia + " e pertence ao aluno: " + aluno);
    }
}