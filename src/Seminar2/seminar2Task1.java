package Seminar2;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class seminar2Task1 {
    public static float InputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a float number: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Incorrect input! Try again: ");
            scanner.next();
        }
        float num = scanner.nextFloat();
        scanner.close();
        return num;
    }

    public static void main(String[] args) {
        float new_num = seminar2Task1.InputNumber();
        System.out.println("Input number: " + new_num);
    }
}