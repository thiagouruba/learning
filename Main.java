import java.util.Scanner;

public class Main {

    static double sum(double num1, double num2){
        return num1 + num2;
    }

    static double sub(double num1, double num2){
        return num1 - num2;
    }

    static double mult(double num1, double num2){
        return num1 * num2;
    }

    static double div(double num1, double num2){
        return num1 / num2;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double num1;
        double num2;
        double result = 0.0;
        int option;

        do {
            System.out.println("Option:\n1. Sum\n2. Sub\n3. Mult\n4. Div\n5. Reset\n6. Exit");
            System.out.println(result);
            option = in.nextInt();

            if (option == 1 && result == 0.0){
                System.out.print("1st number: ");
                num1 = in.nextDouble();
                System.out.print("2nd number: ");
                num2 = in.nextDouble();
                result = sum(num1, num2);
            } else if (option == 1 && result != 0.0){
                System.out.print(result + " + ");
                result = result + in.nextDouble();
            }

            if (option == 2 && result == 0.0){
                System.out.print("1st number: ");
                num1 = in.nextDouble();
                System.out.print("2nd number: ");
                num2 = in.nextDouble();
                result = sub(num1, num2);
            } else if (option == 2 && result != 0.0){
                System.out.print(result + " - ");
                result = result - in.nextDouble();
            }

            if (option == 3 && result == 0.0){
                System.out.print("1st number: ");
                num1 = in.nextDouble();
                System.out.print("2nd number: ");
                num2 = in.nextDouble();
                result = mult(num1, num2);
            } else if (option == 3 && result != 0.0){
                System.out.print(result + " * ");
                result = result * in.nextDouble();
            }

            if (option == 4 && result == 0.0){
                System.out.print("1st number: ");
                num1 = in.nextDouble();
                System.out.print("2nd number: ");
                num2 = in.nextDouble();
                result = div(num1, num2);
            } else if (option == 4 && result != 0.0){
                System.out.print(result + " / ");
                result = result / in.nextDouble();
            }

            if (option == 5){
                result = 0;
            }

        } while (option != 6);

    }
}
