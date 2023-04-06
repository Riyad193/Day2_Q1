import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("الرجاء إدخال رقم: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("الرقم موجب");
        } else if (number < 0) {
            System.out.println("الرقم سالب");
        } else {
            System.out.println("الرقم يساوي 0");
        }
    }
}