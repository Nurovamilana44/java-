import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("Високосный год");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }
}