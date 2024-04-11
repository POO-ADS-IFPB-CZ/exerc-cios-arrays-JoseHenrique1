import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.err.println("Questão 2");
        fibonacci(0, 1, 30);

        System.err.println("Questão 3");
        grade(5);
    }

    //valores da questão               0               1               30
    public static void fibonacci(int beforeNum, int currentNum, int counter) {
        boolean condition  = (beforeNum<0) || (beforeNum>currentNum) || (counter<0);
        if (condition) {
            System.out.println("Informações incorretas");
        } 
        else if (counter == 0) {
            System.out.println("Fim");
        }else {
            System.out.println(currentNum);
            fibonacci(currentNum, currentNum+beforeNum, counter-1);
        } 
    }

    public static void grade(int lengthArray) {
        double grades[] = new double[lengthArray];
        int counter = 1;
        Scanner scanner = new Scanner(System.in);

        //Recebendo as notas
        while (counter <= lengthArray) {
            System.out.print("Digite sua "+counter+"° nota: ");
            grades[counter-1] = scanner.nextDouble();
            scanner.nextLine();
            ++counter;
        }

        //media recebe todas as notas, depois divide pelo tamanho
        double averageGrade = 0;
        for (double grade : grades) {
            averageGrade += grade;
        }
        averageGrade /= (double) lengthArray;

        int biggerNotes = 0;
        int minorNotes = 0;

        //calcula as notas maiores e menores que a media
        for (double grade : grades) {
            if (grade > averageGrade) {
                ++biggerNotes;
            }
            if (grade < averageGrade) {
                ++minorNotes;
            }
        }

        System.out.printf("Media: %f \nNotas maiores que a media: %d \nNotas menores que a media: %d", averageGrade, biggerNotes, minorNotes);
    }

}