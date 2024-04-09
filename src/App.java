public class App {
    public static void main(String[] args) {
        System.err.println("Questão 2");
        fibonacci(0, 1, 30);
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


}