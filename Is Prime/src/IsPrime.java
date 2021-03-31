import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = scanner.nextInt();

        boolean check;

        if (number == 1) check = false;
        else if (number == 2 || number == 3) check = true;
            else {
                check = true;
                for (int i = 2;i < number; i++){
                    if (number % 2 == 0) {
                        check = false;
                        break;
                    }
                }

        }
            if (check) System.out.printf("%d is Prime Number!", number);
            else System.out.printf("%d is not Prime Number!",number);

    }
}
