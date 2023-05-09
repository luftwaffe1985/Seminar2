package Seminar2;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


import java.util.Scanner;

public class seminar2Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String userInput = scanner.nextLine();
            if(userInput.isEmpty()) {
                throw new RuntimeException("Empty lines are not allowed!");
            }
            System.out.println(userInput);
        }
    }

}
